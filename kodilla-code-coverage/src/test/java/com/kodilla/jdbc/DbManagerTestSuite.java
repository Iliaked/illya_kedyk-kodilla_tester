package com.kodilla.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.sql.SQLException;

class DbManagerTestSuite {
    private static DbManager dbManager;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect() {
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    void testSelectUsersWithPosts() throws SQLException {
        // Given
        String countQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING POSTS_NUMBER > 1;";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getPostNumberCount(rs);
        insertUsers(statement);
        insertPosts(statement);

        // When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING POSTS_NUMBER > 1;";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        // Then
        while (rs.next()) {
            String firstName = rs.getString("FIRSTNAME");
            String lastName = rs.getString("LASTNAME");
            int postsNumber = rs.getInt("POSTS_NUMBER");

            System.out.println("User: " + firstName + " " + lastName + " - Posts: " + postsNumber);

            int counter = getPostsCount(rs);
            int expected = count + 2;
            Assertions.assertEquals(expected, counter);
        }

        rs.close();
        statement.close();
    }

    private static final List<AbstractMap.SimpleEntry<Integer, String>> POSTS = List.of(
            new AbstractMap.SimpleEntry<>(9, "Post 1 by User 9"),
            new AbstractMap.SimpleEntry<>(9, "Post 2 by User 9"),
            new AbstractMap.SimpleEntry<>(11, "Post 1 by User 11"),
            new AbstractMap.SimpleEntry<>(7, "Post 1 by User 7"),
            new AbstractMap.SimpleEntry<>(7, "Post 2 by User 7"),
            new AbstractMap.SimpleEntry<>(7, "Post 3 by User 7")
    );

    private void insertPosts(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<Integer, String> post : POSTS) {
            statement.executeUpdate(
                    String.format("INSERT INTO POSTS(USER_ID, BODY) VALUES (%d, '%s')",
                            post.getKey(),
                            post.getValue()
                    )
            );
        }
    }

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')",
                            user.getKey(),
                            user.getValue()
                    )
            );
        }
    }

    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while(rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static int getPostsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while(rs.next()) {
            System.out.printf("%s, %s, %d%n",
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"),
                    rs.getInt("POSTS_NUMBER"));
            counter++;
        }
        return counter;
    }

    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }

    private static int getPostNumberCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("POSTS_NUMBER");
        }
        return count;
    }
}
