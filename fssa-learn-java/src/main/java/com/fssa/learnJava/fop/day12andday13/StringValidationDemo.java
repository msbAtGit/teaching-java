/**
 * 
 */
package com.fssa.learnJava.fop.day12andday13;

import java.util.Scanner;

/**
 * @author BharathwajSoundarara
 *
 */
public class StringValidationDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String input = sc.nextLine();

		if (input == null) {
			System.out.println("The input String is Null");
		} else if (input.trim().isEmpty()) {
			System.out.println("The input String is Empty");
		} else {
			System.out.println("The Input String is: " + input);
		}
		sc.close();
	}

}
