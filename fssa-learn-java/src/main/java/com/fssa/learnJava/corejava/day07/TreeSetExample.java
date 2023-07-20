package com.fssa.learnJava.corejava.day07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TreeSetExample {

	public static void main(String[] args) {

		// TreeSet sorts the collections
		Set<String> cityNames = new HashSet();
		cityNames.add("Delhi");
		cityNames.add("Chennai");
		cityNames.add("Chennai");
		cityNames.add("Bangalore");

		for (String cityName : cityNames) {
			System.out.println(cityName);
		}
		Iterator<String> iterator = cityNames.iterator();
		while (iterator.hasNext()) { 
			System.out.println(iterator.next());
		}

	}

	public static List<String> removeDuplicate(List<String> sourceList) {
		
	}
}
