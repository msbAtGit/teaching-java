package com.fssa.learnJava.corejava.day02;

class Person {
	private String name; // Private data member

	String getName() { // Public getter method
		return name;
	}

	public void setName(String n) { // Public setter method
		 name = n; //Wrong way to use refer the attribute of class
//		this.name = name; // this Keyword used for referring current instance
	}
}

public class PersonThisDemo {
	private String demoClass = "demoClass";
	public static void main(String[] args) {
		// Usage
		Person person = new Person();
		
		person.setName("John"); // Setting the name using the setter method
		String name = person.getName(); // Accessing the name using the getter method
		System.out.println(name); // Output: John

	}
}
