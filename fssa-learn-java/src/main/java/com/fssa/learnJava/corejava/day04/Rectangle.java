/**
 * 
 */
package com.fssa.learnJava.corejava.day04;

/**
 * @author BharathwajSoundarara
 *
 */
public class Rectangle extends Polygon {
	
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) throws Exception {
		super(4);
		if(length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.length * this.breadth;
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}

}
