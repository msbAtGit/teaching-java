/**
 * 
 */
package com.fssa.learnJava.fop.day14;

/**
 * @author BharathwajSoundarara
 *
 */

public class StringBufferDemo {

	public static void main(String[] args) {

		String firstName = "Sachin";
		String lastName = " Tendulkar";

		StringBuffer fullName = new StringBuffer();
		fullName.append(firstName);
		fullName.append(" ");
		fullName.append(lastName);

		System.out.println(fullName);

	}

}
