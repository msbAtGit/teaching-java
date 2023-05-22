package com.fssa.learnJava.fop.day04;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestCalculator {
	
	Calculator calculator = new Calculator();

	@Test
	public void testAdd() {
		double firstNum = 5.0;
		double secondNum = 6.6;
		
		Assertions.assertEquals((firstNum + secondNum), 
				calculator.add(firstNum, secondNum));
	}
	
	@Test
	public void testSubtract() {
		double firstNum = 5.0;
		double secondNum = 5.0;
		
		Assertions.assertTrue(calculator.subtract(firstNum, secondNum) == 0.0);
	}
	
	@Test
	public void testMultiply() {
		double firstNum = 5.0;
		double secondNum = 5.0;
		
		Assertions.assertTrue(Calculator.multiply(firstNum, secondNum) == 25.0);
	}
	

}
