package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTestSuite {
    @Test
    void testFilterChemistGroupUsernames() {
        List<String> expectedUsernames = List.of("Walter White", "Gale Boetticher");
        List<String> actualUsernames = UsersManager.filterChemistGroupUsernames();
        assertEquals(expectedUsernames, actualUsernames);
    }

    @Test
    void testFilterAgeGroupUsernames() {
        List<String> expectedUsernames = List.of("Walter White", "Gus Firing", "Gale Boetticher", "Mike Ehrmantraut");
        List<String> actualUsernames = UsersManager.filterAgeGroupUsernames();
        assertEquals(expectedUsernames, actualUsernames);
    }

    @Test
    void testFilterNumberOfPosts() {
        List<String> expectedUsernames = List.of("Jessie Pinkman", "Tuco Salamanca");
        List<String> actualUsernames = UsersManager.filterNumberOfPosts();
        assertEquals(expectedUsernames, actualUsernames);
    }
}

