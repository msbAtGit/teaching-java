package com.fssa.learnJava.fop.day04;

/**
 * Book class which has an attribute named author
 * @author BharathwajSoundarara
 *
 */
class Book {
	String name="Bharath";
	public void display() {
		System.out.println("Display Method is invoked");
	}
	public void printMyName() {
		System.out.println(name);
	}
	//<accessModifier> <returnType> <name>(argumentType arg, ....) {}
	
	public void setName(String nameArg) {
		name = nameArg;
	}
	public String getName() {
		return name;
	}
}

/** A java class which will instantiate the Book class
 * And create an object book1 and call its attributes and methods
 * @author BharathwajSoundarara
 *
 */
public class BookDemo {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.setName("Harry Potter and the Half blood prince");
		System.out.println(book1);
		book1.display();
		System.out.println(book1.getName());

	}
	
	

}
