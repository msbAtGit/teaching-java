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

		StringBuilder fullName = new StringBuilder();
		fullName.append(firstName);
		fullName.append(" ");
		fullName.append(lastName);

		System.out.println(fullName);

	}

}
