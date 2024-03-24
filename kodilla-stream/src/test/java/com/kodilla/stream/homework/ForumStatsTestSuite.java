package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTestSuite {

    @Test
    void testAveragePostsForUsersAbove40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 50, 20, "Chemists"));
        users.add(new User("Bob", 45, 15, "Sales"));
        users.add(new User("Charlie", 38, 10, "Physicists"));

        UsersRepository usersList = new UsersRepository();

        // Execute the method to be tested
        double averagePosts = ForumStats.averagePostsForUsersAbove40(usersList);

        // Check the result
        assertEquals(17.5, averagePosts);
    }

    @Test
    void testAveragePostsForUsersBelow40() {
    }
}