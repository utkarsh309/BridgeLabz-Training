package com.junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@BeforeEach
	void setup() {
		calculator=new Calculator();
	}
	
	@Test
	void testAdd() {
		int result=calculator.add(10, 5);
		assertEquals(15,result);
	}
	
	@Test
	void testSubtract() {
		int result=calculator.subtract(10,5);
		assertEquals(5,result);
	}
	
	@Test
	void testMultiply() {
		int result=calculator.multiply(10, 5);
		assertEquals(50,result);
	}
	
	@Test
	void testDivide() {
		int result=calculator.divide(10, 5);
		assertEquals(2,result);
	}
	
	@Test
	void testDivideByZero() {
		assertThrows(ArithmeticException.class,
				() ->calculator.divide(10, 0)
		);
	}
	
}
