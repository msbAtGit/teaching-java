package com.fssa.learnJava.corejava.day04;

public class RightAngledTriangle extends Polygon {
	double height;
	double base;
	
	
	public RightAngledTriangle(double height2, double base2) throws Exception {
		super(3);
		this.height = height2;
		this.base = base2;
	}
	
	@Override
	public double calculateArea() {
		System.out.println("Calling Right angled triangle area calc");
		return (1/2)*this.height*this.base;
	}
	
	public void colorIt() {
		System.out.println("Coloring the 90 triangle");
	}
}
