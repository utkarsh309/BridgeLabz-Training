package com.junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

    private TemperatureConverter converter;

    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    void testCelsiusToFahrenheit() {
        double result = converter.celsiusToFahrenheit(0);
        assertEquals(32.0, result, 0.001);
    }

    @Test
    void testFahrenheitToCelsius() {
        double result = converter.fahrenheitToCelsius(32);
        assertEquals(0.0, result, 0.001);
    }

}