/**
 * 
 */
package com.fssa.learnJava.fop.day05;

/**
 * In the real world, you'll often find many individual objects all of the same
 * kind. There may be thousands of other bicycles in existence, all of the same
 * make and model. Each bicycle was built from the same set of blueprints and
 * therefore contains the same components. In object-oriented terms, we say that
 * your bicycle is an instance of the class of objects known as bicycles. A
 * class is the blueprint from which individual objects are created.
 * 
 * @author BharathwajSoundarara
 *
 */
class Bicycle {

	int cadence = 0;
	int speed = 0;
	int gear = 1;

	void changeCadence(int newValue) {
		cadence = newValue;
	}

	void changeGear(int newValue) {
		gear = newValue;
	}

	void speedUp(int increment) {
		speed = speed + increment;
	}

	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
	}
}

/**
 * Here's a BicycleDemo class that creates two separate Bicycle objects and
 * invokes their methods:
 * 
 * @author BharathwajSoundarara
 *
 */
public class BicycleDemo {
	public static void main(String[] args) {

		// Create two different
		// Bicycle objects
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();

		// Invoke methods on
		// those objects
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();

		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.changeCadence(40);
		bike2.speedUp(10);
		bike2.changeGear(3);
		bike2.printStates();
	}
}