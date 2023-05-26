/**
 * 
 */
package com.fssa.learnJava.corejava.day07;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author BharathwajSoundarara
 *
 */

class Emp {

	int i;

	public Emp(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (i != other.i)
			return false;
		return true;
	}

}

public class HashCodeEqualsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Emp emp1 = new Emp(23);
        Emp emp2 = new Emp(23);
 
        System.out.println("emp1.equals(emp2)--->>>" + emp1.hashCode());
        System.out.println("emp1.equals(emp2)--->>>" + emp2.hashCode());
        System.out.println("emp1.equals(emp2)--->>>" + emp1.equals(emp2));
 
        ArrayList<Emp> list = new ArrayList<Emp>();
        list.add(emp1);
        list.add(emp2);
        System.out.println("ArrayList size:" + list.size());
 
        HashSet<Emp> set = new HashSet<>();
        set.add(emp1);
        set.add(emp2);
 
        for (Emp emp : set) {
            System.out.println(emp);
        }
 
        System.out.println("HashSet size:" + set.size());
 
	}

}
