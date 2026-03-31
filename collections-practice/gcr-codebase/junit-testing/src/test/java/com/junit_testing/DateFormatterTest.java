package com.junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateFormatterTest {

    @Test
    void testValidDate() {
        String result = new DateFormatter().formatDate("2024-01-15");
        assertEquals("15-01-2024", result);
    }

    @Test
    void testInvalidFormat() {
        assertThrows(IllegalArgumentException.class, () ->
                new DateFormatter().formatDate("15-01-2024")
        );
    }

    @Test
    void testNullDate() {
        assertThrows(IllegalArgumentException.class, () ->
                new DateFormatter().formatDate(null)
        );
    }
}