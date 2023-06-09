package com.fssa.learnJava.fop.day07;

public class ConditionalStatementDemo3 {

	public static void main(String[] args) {

		int mark = 40;

		if (mark >= 75) {
			System.out.println("You got an A grade");
		} 
		else if(mark >= 60) { 
			System.out.println("You got an B grade");
		} 
		else if(mark >= 45) { 
			System.out.println("You got an C grade");
		} 
		else {
			System.out.println("You didn't get an A, B or C grade");
		}

	}

}
