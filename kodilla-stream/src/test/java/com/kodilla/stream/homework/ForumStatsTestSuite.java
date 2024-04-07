package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTestSuite {

    @Test
    void testAveragePostsForUsersAbove40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 50, 20, "Chemists"));
        users.add(new User("Bob", 45, 15, "Sales"));
        users.add(new User("Charlie", 38, 10, "Physicists"));

        double averagePosts = ForumStats.averagePostsForUsersAbove40(users);

        assertEquals(17.5, averagePosts);
    }

    @Test
    void testAveragePostsForUsersBelow40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 50, 20, "Chemists"));
        users.add(new User("Bob", 45, 15, "Sales"));
        users.add(new User("Charlie", 38, 10, "Physicists"));
        users.add(new User("Mike", 21, 44, "Physicists"));

        double averagePosts = ForumStats.averagePostsForUsersBelow40(users);

        assertEquals(27.0, averagePosts);
    }

    @Test
    public void testAveragePostsForUsersBelow40_Null() {
        List<User> users = null;
        double result = ForumStats.averagePostsForUsersBelow40(Optional.ofNullable(users).orElse(Collections.emptyList()));
        assertEquals(0, result);
    }
}