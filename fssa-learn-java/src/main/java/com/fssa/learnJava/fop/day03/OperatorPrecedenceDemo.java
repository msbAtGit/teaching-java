package com.fssa.learnJava.fop.day03;

public class OperatorPrecedenceDemo {
	public static void main(String[] args) {
		// Operator precedence

		int a = -10;
		int b = +20;
		int c = +15;
		
		// The multiplication * is performed before
		// before doing the - subtraction
		int d = a - b * c; 
		
		System.out.println(d);
	}
}
