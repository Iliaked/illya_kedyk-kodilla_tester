package com.kodilla.parametrized_tests.homework;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidatorTestSuite {

    public boolean validateUsername(String username) {
        return username.matches("^[a-zA-Z0-9._-]{3,}$");
    }

    @ParameterizedTest
    @ValueSource(strings = { "user123", "user_name", "user.name", "USER-NAME", "123user" })
    void validUsernames(String username) {
        assertTrue(validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = { "u", "us", "us?", "user?" })
    void invalidUsernames(String username) {
        assertFalse(validateUsername(username));
    }

    public boolean validateEmail(String email) {
        if (null != email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
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
        assertTrue(validateEmail(email));
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
        assertFalse(validateEmail(email));
    }
}
