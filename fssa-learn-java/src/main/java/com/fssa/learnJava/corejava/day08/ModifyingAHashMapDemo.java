package com.fssa.learnJava.corejava.day08;

import java.util.HashMap;

public class ModifyingAHashMapDemo {
	public static void main(String[] args) {

		// Task: store department name and no of employees working in the department
		HashMap<String, Integer> marksMap = new HashMap<String, Integer>();
		marksMap.put("HR", 5);
		marksMap.put("ADMIN", 10);
		marksMap.put("DEVELOPERS", 300);


		// Modifying a particular count
		int hrCount = marksMap.get("HR");
		hrCount += 1;
		marksMap.put("HR", hrCount);

		// Iterate
		for (String deptName : marksMap.keySet()) {

			Integer count = marksMap.get(deptName);
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}
		
		marksMap.remove("HR");
		System.out.println(marksMap);
		marksMap.clear();
		System.out.println(marksMap);
		marksMap.clear();
		
	}
}
