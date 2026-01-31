package com.junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class StringUtilsTest {

	private StringUtils stringUtils;
	
	@BeforeEach
	void setUp() {
		stringUtils=new StringUtils();
	}
	
	//Reverse test
	@Test
	void testReverse() {
		assertEquals("olleh",stringUtils.reverse("hello"));
	}
	
	@Test
	void testReverseWithNull() {
		assertNull(stringUtils.reverse(null));
	}
	
	//Pallindrome test
	@Test
	void testIsPallindromeTrue() {
		assertTrue(stringUtils.isPallindrome("madam"));
	}
	
	@Test
	void testIsPallindromeFalse() {
		assertFalse(stringUtils.isPallindrome("Hello"));
	}
	
	@Test
	void testIsPallindromeWithNull() {
		assertFalse(stringUtils.isPallindrome(null));
	}
	
	//To uppercase test
	@Test
	void testToUpperCase() {
		assertEquals("JAVA",stringUtils.toUpperCase("java"));
	}
	
	@Test
	void testToUpperCaseWithNull() {
		assertNull(stringUtils.toUpperCase(null));
	}
}
