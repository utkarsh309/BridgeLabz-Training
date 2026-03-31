package com.junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    private final UserRegistration registration = new UserRegistration();

    //Valid registration
    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() ->
                registration.registerUser("john", "john@gmail.com", "password123")
        );
    }

    //Invalid username
    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("", "john@gmail.com", "password123")
        );
    }

    // Invalid email
    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("john", "johngmail.com", "password123")
        );
    }

    // Invalid password
    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("john", "john@gmail.com", "123")
        );
    }
}