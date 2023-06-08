package com.fssa.learnJava.fop.day04;

/**
 * Demonstrating Static method
 * 
 * @author BharathwajSoundarara
 *
 */
class MathUtil {
	
	// A static is used when you have to call method without an object
	public static boolean isEven(int num) {
		return (num % 2) == 0;
	}
}

public class MathUtilDemo {

	public static void main(String[] args) {
		System.out.println(MathUtil.isEven(9));
		
		//Example of static methods from java Library
		Integer.parseInt("10");
		Math.sqrt(3);
	}
}