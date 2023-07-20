package com.fssa.learnJava.corejava.day04;

public abstract class Polygon {
	protected int numberOfSides;
	
	public Polygon (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	
	
	public abstract double calculateArea();
	
	public abstract void colorIt();
}
