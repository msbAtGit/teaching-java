package com.fssa.learnJava.corejava.day06;

import java.util.Arrays;
import java.util.List;

/**
 * Demo class to show how to convert an Array into a List
 * @author BharathwajSoundarara
 *
 */
public class ConvertArraytoList {
	public static void main(String[] args) {
		String[] deptNames = new String[3];
		deptNames[0] = "CSE";
		deptNames[1] = "EEE";
		deptNames[2] = "MECH";
		List<String> list = Arrays.asList(deptNames);
		System.out.println(list);
		
		for (String dept : list) {
			System.out.println(dept);
		}
	}
}
