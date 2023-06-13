package com.fssa.learnJava.fop.day10andday11;

/**
 * Demo of what happens when we access more elements
 * 
 * @author BharathwajSoundarara
 *
 */
public class ArrayOutOfBoundsDemo {
	public static void main(String[] args) {
		int[] intArr = { 49, 50, 70 };

		// Trying access an element which is not initialised and declared
		intArr[4] = 80;
	}
}
