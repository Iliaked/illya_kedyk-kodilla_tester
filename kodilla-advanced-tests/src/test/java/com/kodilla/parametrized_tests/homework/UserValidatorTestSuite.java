package com.kodilla.parametrized_tests.homework;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = { "user123", "user_name", "user.name", "USER-NAME", "123user" })
    void validUsernames(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = { "u", "us", "us?", "user?" })
    void invalidUsernames(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "user@example.com",
            "user.name@example.com",
            "user123@example.com",
            "user-name@example.com",
            "user123@example.co.uk",
            "user_name@example.domain.com",
            "user@subdomain.example.com",
    })
    void validEmails(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "user@.example.com",
            "user@example",
            "@example.com",
            "user@example.",
            "user name@example.com",
            "user!name@example.com",
            "user@example_com"
    })
    void invalidEmails(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}
