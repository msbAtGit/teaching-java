package com.fssa.learnJava.corejava.day05;

/**
 * Engine class
 * @author BharathwajSoundarara
 *
 */
class Engine {

	String capacity;

	public Engine(String capacity) {
		this.capacity = capacity;
	}

	public void printEngineDetails() {
		System.out.println("Engine Capacity: " + this.capacity);
	}
}

/** 
 * Car with just the engine and maker details
 * @author BharathwajSoundarara
 *
 */
class Car {
	Engine engine;
	String maker;

	public Car(String maker, Engine engine) {
		this.engine = engine;
		this.maker = maker;
	}

	public void printCarDetails() {
		System.out.println("Maker: " + maker);
		this.engine.printEngineDetails();
	}
}

public class HasARelDemo {
	public static void main(String[] args) {
		// We need make the engine before making a car
		Engine engine1 = new Engine("1000cc");

		// Creating a maruti car
		Car marutiCar = new Car("Maruti", engine1);

		marutiCar.printCarDetails();

		// We need make the engine before making a car
		Engine engine2 = new Engine("1500cc");

		// Creating a benz car
		Car benz = new Car("Mercedes Benz", engine2);

		benz.printCarDetails();

	}
}
