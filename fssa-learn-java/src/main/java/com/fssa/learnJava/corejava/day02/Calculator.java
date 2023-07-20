package com.fssa.learnJava.corejava.day02;

public class Calculator {
    public double add(int a, int b) {
    	
    	System.out.println("Calling Integer add method");
        return a + b;
    }
    
//    public double add(double a, double b) {
//    	System.out.println("Calling Double add method");
//        return a + b;
//    }
    
    public String add(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
    	// Usage
    	Calculator calc = new Calculator();
    	System.out.println(calc.add(2.0, 3));           // Output: 5
//    	System.out.println(calc.add(2.0, 3.7));       // Output: 5.7
    	System.out.println(calc.add("Hello", "World"));  // Output: HelloWorld
	}
}

