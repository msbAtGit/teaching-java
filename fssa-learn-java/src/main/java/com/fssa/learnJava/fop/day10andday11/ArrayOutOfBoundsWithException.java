package com.fssa.learnJava.fop.day10andday11;

/**
 * Handling the ArrayIndexOutOfBoundsException with a try catch
 * 
 * @author BharathwajSoundarara
 *
 */
public class ArrayOutOfBoundsWithException {
	public static void main(String[] args) {
		try {
//			demoIndexOutOfBounds();
			int[] intArr = { 49, 50, 70 };

			// Trying access an element which is not initialised and declared
			intArr[4] = 80;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void demoIndexOutOfBounds() {
		
	}
}
