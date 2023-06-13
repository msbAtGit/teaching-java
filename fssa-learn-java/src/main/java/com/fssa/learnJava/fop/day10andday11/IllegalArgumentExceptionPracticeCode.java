package com.fssa.learnJava.fop.day10andday11;

class UserAccount {

	public static void validateUsername(String username) throws IllegalArgumentException {
		if (username == null) {
			// Complete the exception with 
			// error message "Invalid Username"
		}

		if (username.length() < 8) {
			// Complete the exception 
			// with message "Username must have atleast 8 chars";
		}
	}
	
	public static void validateAge(int age)  {
		// Add your code here to validate 
		// Throw an IllegalArgumentException
		// With error msg "Invalid age"
	}
}

public class IllegalArgumentExceptionPracticeCode {

	public static void main(String[] args) {

		String username = "n";

		try {
			UserAccount.validateUsername(username);
			// insert into users(username) values (?);
			// sendmail
			// sendsms
		} catch ( e) { // Fix the compiler Errors as well
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
