package com.fssa.learnJava.fop.day06;

/**
 * In this example, we start with the originalString variable containing the
 * value "Hello". Then, we use the concat() method to concatenate " World!" to
 * the original string and store the result in the modifiedString variable.
 * However, notice that the original string remains unchanged.
 * 
 * This behaviour demonstrates the immutability of the String class. When you
 * perform any operation on a String object, such as concatenation, the original
 * string remains unaltered, and a new String object is created with the
 * modified value. This immutability property ensures that strings are safe to
 * share across different parts of a program without worrying about their
 * content being changed unexpectedly.
 * 
 * @author BharathwajSoundarara
 *
 */
public class StringImmutabilityDemo {
	public static void main(String[] args) {
		// Declaring a string
		String originalString = "Hello";
		System.out.println("Original String: " + originalString);

		// Concatenating another String to the Original String
		String modifiedString = originalString.concat(" World!");

		// ModifiedString after concatenation
		System.out.println("Modified String: " + modifiedString);

		// Unchanged Original String
		System.out.println("Original String after modification: " + originalString);
	}
}
