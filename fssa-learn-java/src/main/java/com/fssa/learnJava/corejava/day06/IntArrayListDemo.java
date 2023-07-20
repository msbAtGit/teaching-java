package com.fssa.learnJava.corejava.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IntArrayListDemo {
	public static void main(String[] args) {
		Integer[] arr = {3,4,5,6,3};
//		List<Integer> arrInt = new ArrayList<>(Arrays.asList(arr));
		List<Integer> readOnlyList = Arrays.asList(arr);
		List<Integer> arrInt = new ArrayList<>(readOnlyList);
		System.out.println(arrInt);
		arrInt.remove(Integer.valueOf(3));
		System.out.println(arrInt);
		
		
	}
}
