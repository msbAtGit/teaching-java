package com.fssa.learnJava.fop.day15;

import java.util.Scanner;

public class ScannerHasNextDemo {

	public static void main(String[] args) {
		// Create a string with multiple words
//		String sentence = "Hello world! How are you?";

		// Create a scanner to read from the string
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Sentence: ");
		int word = scanner.nextInt();
		System.out.println(word);
		
		while (scanner.hasNext()) {
			word = scanner.nextInt();
			System.out.println(word);
		}

		// Check if the scanner has another token to read
		// Print the result
		System.out.println(scanner.hasNext());

		// Close the scanner
		scanner.close();
	}

}
