package com.fssa.learnJava.corejava.day06;

import java.util.ArrayList;

public class TestArrayList {
	 
    //without using generics
    public static void main(String[] args) {
    	
    	
        // Store the city names in the List
        ArrayList<String> cityList  = new ArrayList<String>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        cityList.add("9");
        
        
        
        // Display the city names
        for (String cityName : cityList) {
//            String cityName = (String) object; // TypeCast object to String
            System.out.println(cityName);           
        }
 
    }
 
}
