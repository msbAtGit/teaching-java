package com.fssa.learnJava.corejava.day01;


/**
 * Solved Example for day 1
 * @author BharathwajSoundarara
 *
 */
class Book {
	public String title;
	public String author;
	private double price;
	String publisher;
	
	
	public void printBookDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
	
	
}

public class AccessModifierExample {
	public static void main(String[] args) {
		Book book1 = new Book();
		
		book1.title = "Harry Potter";
		book1.author = "JK Rowling";
		book1.publisher = "Penguin Books"; // Publisher can be accessed by
											// classes within the same package
//		book1.price = 400; // Will throw a compilation issue since its private
		book1.printBookDetails();
		
	
		
		
		
	}
}
