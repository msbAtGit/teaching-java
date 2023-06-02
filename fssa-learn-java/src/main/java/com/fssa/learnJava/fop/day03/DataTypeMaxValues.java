package com.fssa.learnJava.fop.day03;


public class DataTypeMaxValues {
	public static void main(String[] args) {
		System.out.println("Byte range: " + Byte.MIN_VALUE + " to "+ Byte.MAX_VALUE );
		System.out.println("Short Int range: " + Short.MIN_VALUE + " to "+ Short.MAX_VALUE );
		
		// Ganganam Style YouTube video Integer overflow eg
		System.out.println("Integer range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		System.out.println("Float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
		System.out.println("Double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
		
		
		
		//Operator precedence
		
		int a = 10;
		int b = 20;
		int c = 15;
		int d = a - b * c; //Value of d is 290
		
		System.out.println(d);
		
	}
}
