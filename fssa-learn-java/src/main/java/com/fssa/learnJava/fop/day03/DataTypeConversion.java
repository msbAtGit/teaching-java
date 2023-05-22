/**
 * 
 */
package com.fssa.learnJava.fop.day03;

/**
 * @author BharathwajSoundarara
 *
 */
public class DataTypeConversion {
	public static void main(String[] args) {
		//Converting String to Integer
		
		String numStr = "89";
		int num = Integer.parseInt(numStr);
		System.out.println(num + 10);
		
		//Converting String to Float
		String floatNumStr = "3.14f"; //Approximation of PI
		float floatNum = Float.parseFloat(floatNumStr);
		System.out.println(floatNum + 4.2f);
		
		//Converting String to Double
		String doubleNumStr = "1.618"; //Golden Ratio
		double doubleNum = Double.parseDouble(doubleNumStr);
		System.out.println(doubleNum + 1.2);
		
		
		
	}
}
