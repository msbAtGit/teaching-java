/**
 * 
 */
package com.fssa.learnJava.corejava.day08;

import java.util.HashMap;
import java.util.Map;

/**
 * @author BharathwajSoundarara
 *
 */
public class HashMapDemo {
	public static void main(String[] args) {

		// Task: store department name and no of employees working in the department
		Map<String, Integer> marksMap = new HashMap<String, Integer>();
		marksMap.put("HR", 5);
		marksMap.put("ADMIN", 10);
		marksMap.put("DEVELOPERS", 300);
		marksMap.put("HR", 10);

		// Iterate
		for (String deptName : marksMap.keySet()) {

			Integer count = marksMap.get(deptName);
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}
		System.out.println(marksMap);
		marksMap.clear();

	}

}
