package com.fssa.learnJava.fop.day03;

import java.util.Scanner;

/**
 * Demonstrating How to read a string using Scanner
 * @author BharathwajSoundarara
 *
 */
public class ReadingStringScannerDemo {
	public static void main(String[] args) {
		// Creating a Scanner using new operator by referencing the System's Input
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = s2.nextLine(); // Reading the nextLine
		System.out.println("Index of space: " + name.indexOf("XYZ"));
		
		
		System.out.println("Enter the degree name:"); 
		String degree = s2.nextLine();       
		System.out.println("Name=" + name + ",degree=" + degree);
		
		s2.close();
	}

}
