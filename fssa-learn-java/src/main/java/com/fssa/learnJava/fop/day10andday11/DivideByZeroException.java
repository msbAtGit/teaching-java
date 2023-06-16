package com.fssa.learnJava.fop.day10andday11;

public class DivideByZeroException {
	public static void main(String[] args) {
		int n1 = 50;
		int n2 = 0;
		try {
			int result = n1/n2;
			System.out.println("Result is: " + result);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
