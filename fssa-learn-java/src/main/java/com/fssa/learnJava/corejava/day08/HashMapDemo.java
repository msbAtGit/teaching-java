/**
 * 
 */
package com.fssa.learnJava.corejava.day08;

import java.util.HashMap;

/**
 * @author BharathwajSoundarara
 *
 */
public class HashMapDemo {
	 public static void main(String[] args) {
		 
	        // Task: store department name and no of employees working in the department        
	        HashMap<String,Integer>  marksMap = new HashMap<String,Integer>();
	        marksMap.put("HR", 5);
	        marksMap.put("ADMIN" , 10);
	        marksMap.put("DEVELOPERS" , 300);
	         
	        //Iterate 
	        for ( String deptName : marksMap.keySet()){
	             
	            Integer count = marksMap.get(deptName);
	            System.out.println("Department Name:" + deptName + " and Employee Count :" + count );
	             
	        }       
	 }

}
