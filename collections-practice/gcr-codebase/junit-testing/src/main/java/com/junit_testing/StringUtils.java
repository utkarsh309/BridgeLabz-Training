package com.junit_testing;


public class StringUtils {

	public String reverse(String str) {
		if(str==null) {
			return null;
		}
		return new StringBuilder(str).reverse().toString();
	}
	
	public boolean isPallindrome(String str) {
		if(str==null) {
			return false;
		}
		String reversed=reverse(str);
		return str.equals(reversed);
	}
	
	public String toUpperCase(String str) {
		if(str==null) {
			return null;
		}
		return str.toUpperCase();
	}
	
}
