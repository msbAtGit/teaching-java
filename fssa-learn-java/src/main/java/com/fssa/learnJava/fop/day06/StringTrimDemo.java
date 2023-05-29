/**
 * 
 */
package com.fssa.learnJava.fop.day06;

/**
 * @author BharathwajSoundarara
 *
 */
public class StringTrimDemo {

	public static void main(String[] args) {

		// input
		String firstName = "    Bharathwaj     ";

		// output
		System.out.println("Without Trim method: " + firstName);		
		System.out.println("With Trim method: " + firstName.trim());

		System.out.println("length Without Trim method: " + firstName.length());
		System.out.println("Length With Trim method: " + firstName.trim().length());
		
	}

}
