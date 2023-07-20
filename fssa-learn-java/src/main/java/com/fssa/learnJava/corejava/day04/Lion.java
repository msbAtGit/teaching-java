package com.fssa.learnJava.corejava.day04;

class Animal {
	protected int age;
	private String name;

	public Animal(String name) {
		System.out.println("Calling Parent Constructor");
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Lion extends Animal { // extends keyword use to inherit variables and methods from Animal
	public Lion(String name, int age) {
		super(name);		// Calling the constructor of Animal class
		this.age = age;
		System.out.println("Calling Child Constructor");
	}

	
	public void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}

	public static void main(String[] args) {
		Lion simba = new Lion("simbal");
		simba.setAge(10); // setAge() method was not defined in Lion; it is inherited from Animal
		simba.roar();
	}
}
