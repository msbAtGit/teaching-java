/**
 * 
 */
package com.fssa.learnJava.fop.day07;

/**
 * Code to demonstrate how not to use of If else and be wary of 
 * the conditions being used
 * @author BharathwajSoundarara
 *
 */
public class WrongConditionalsUsage {
	public static void main(String[] args) {
		int hourOfDay = 10;
		// Can you find what's wrong here?
		if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else if (hourOfDay < 11) {
			System.out.println("Good Morning"); 
		} else {
			System.out.println("Good Evening");
		}
	}
}
