package com.fssa.learnJava.fop.day09;

//import java.util.Arrays;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;

public class ArrayDemo {

	public static void main(String[] args) {

	
		// Array with a length of 3
		int[] marks = new int[3];
		
		// Another way to declare array
//		int[] marks2 = {90, 10, 33};
		
		// assign marks in the array
		marks[0] = 50;
		marks[1] = 60;
		marks[2] = 70;
		
	

    
		// find how many items in the array
    System.out.println("Array size is: " + marks.length);
		
	
		// Iterate array using for loop
		for (int i = 0; i < marks.length; i++) {
			int m = marks[i];
			System.out.println("Mark is: " + m);
		}
		
		//Lambda expression HOTS
//		IntStream arryAsStream =  Arrays.stream(marks2);
//		
//		arryAsStream.forEach((x) -> System.out.println("Marks: " + x));
	}
	
	
	

}
