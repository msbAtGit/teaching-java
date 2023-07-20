package com.fssa.learnJava.corejava.day08.practice;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHashMapListObj {
	
	
	@Test
	public void testPrintEmpNameByDept() {
		
		StringBuilder expectedString = new StringBuilder("");
		expectedString.append("HR:Samantha");
		expectedString.append(System.lineSeparator());
		expectedString.append("IT:Ram,Suresh");
		expectedString.append(System.lineSeparator());
		
		List<String> inputLines = new ArrayList<String>();
		
		inputLines.add("HR,Samantha");
		inputLines.add("IT,Ram");
		inputLines.add("IT,Suresh");
		
		Assertions.assertEquals(expectedString.toString(), 
				HashMapListObj.printEmpNameByDept(inputLines).toString());
		
		
	}
}
