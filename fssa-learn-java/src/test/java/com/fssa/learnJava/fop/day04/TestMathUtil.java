package com.fssa.learnJava.fop.day04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMathUtil {
	
	@Test
	public void testIsEven()
	{
		Assertions.assertFalse(MathUtil.isEven(3));
	}

}
