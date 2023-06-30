package com.fssa.learnJava.fop.day18;

/**
 * Validation Util for validating specific fields Explains why JUNIT is needed
 * 
 * @param age
 * @return
 */
public class ValidationUtil {
	public static boolean validateAge(int age) throws IllegalArgumentException {
		if (age <= 0) {// Check if the age is a positive value
			throw new IllegalArgumentException("Invalid age");

		} else {
			return true;
		}
	}
}
