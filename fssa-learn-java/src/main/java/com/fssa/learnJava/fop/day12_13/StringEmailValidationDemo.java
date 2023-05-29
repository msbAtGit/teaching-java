package com.fssa.learnJava.fop.day12_13;

import java.util.regex.Pattern;

public class StringEmailValidationDemo {

	public static void main(String[] args) {

		String email = "surya.umapathyfreshworks.com";
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

		Boolean isMatch = Pattern.matches(regex, email);

		if (isMatch) {
			System.out.println("The email address is: Valid");
		} else {
			System.out.println("The email address is: Invalid");
		}

	}

}
