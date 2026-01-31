package com.junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathUtilityTest {

    @Test
    void testDivideByZeroThrowsException() {
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> new Calculator().divide(10, 0)
        );

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
