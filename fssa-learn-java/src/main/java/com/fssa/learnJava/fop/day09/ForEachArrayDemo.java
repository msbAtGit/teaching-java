package com.fssa.learnJava.fop.day09;

/**
 * Class to demo Iterating an array using for each syntax
 * 
 * @author BharathwajSoundarara
 *
 */
public class ForEachArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 6, 19, 10 };
		int sum = 0;
		// For Each Syntax for looping with each element
		for (int element : arr) {
			sum += element; // Summing up each element
			System.out.println("Added element: " + element);
		}
		System.out.println("Sum of elements: " + sum);
	}
}
