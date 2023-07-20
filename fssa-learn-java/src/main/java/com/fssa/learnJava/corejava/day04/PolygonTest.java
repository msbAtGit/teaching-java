package com.fssa.learnJava.corejava.day04;

public class PolygonTest {
	public static void main(String[] args) {
		
		try {
			Polygon rec;
			rec = new Rectangle (10, 5);
			rec.colorIt();
			rec.calculateArea();
			Polygon ratt = new RightAngledTriangle(20.0, 10.0);
			ratt.calculateArea();
			ratt.colorIt();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
