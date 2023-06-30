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

public class TestBook {
	public static void main(String[] args) {
		Book book1 = new Book();
		
		book1.title = "Harry Potter";
		book1.author = "JK Rowling";
		book1.publisher = "Penguin Books";
//		book1.price = 400; // Will throw a compilation issue since its private
		System.out.println("------------Book1 Details---------");
		book1.printBookDetails();
		
		Book book2 = new Book();
		
		book2.title = "Lord of the Rings";
		book2.author = "JRR Tolkien";
//		book2.price = 800;// Will throw a compilation issue since its private
		System.out.println("------------Book2 Details---------");
		book2.printBookDetails();
		
		
		
		
	}
}