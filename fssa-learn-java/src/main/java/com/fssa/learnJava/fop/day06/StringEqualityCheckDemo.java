package com.fssa.learnJava.fop.day06;

/**
 * Demonstrating the why using equals a good practice 
 * @author BharathwajSoundarara
 *
 */
public class StringEqualityCheckDemo {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		System.out.println("Comparing s1 and s2 strings: " + (s1 == s2));
		System.out.println("Comparing s2 and s3 strings: " + (s2 == s3));
		
		// Figure out why the second line is coming as false 
		// where as the first line is true
	}
}
