package com.fssa.learnJava.fop.day03;

import java.util.Scanner;

public class ReadingStringScannerDemo {
	public static void main(String[] args) {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = s2.nextLine();
		         
		System.out.println("Enter the degree name:");
		String degree = s2.nextLine();       
		System.out.println("Name=" + name + ",degree=" + degree);
		
		s2.close();
	}

}
