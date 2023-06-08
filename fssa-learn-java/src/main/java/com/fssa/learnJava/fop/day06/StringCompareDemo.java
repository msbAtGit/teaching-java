package com.fssa.learnJava.fop.day06;

public class StringCompareDemo {

	public static void main(String[] args) {

		// input
		String name1 = "    Bharathwaj     ";
		String name2 = "Bharathwaj";

		// output
		System.out.println("Comparing without .trim()");
		System.out.println("Comparing using comparsion operator (==): " + (name1 == name2));
		System.out.println("Comparing using .equals() method: " + name1.equals(name2));

		
		
		System.out.println(name1.trim().length());
		System.out.println(name2.trim().length());
		
		System.out.println("\nComparing with .trim()");
		System.out.println(name1.trim() == name2.trim());
		System.out.println(name1.trim().equals(name2.trim()));
	}

}
