package com.fssa.learnJava.fop.day14;

/**
 * Class created for demonstrating appending with String builder
 * 
 * @author BharathwajSoundarara
 *
 */
public class StringBuilderLoopAppender {
	public static void main(String[] args) {

		// Program to demonstrate creating a String
		// Appending a array of Strings
		String[] strArr = { "This", "is", "a", "collection", "of", "words", "to",
				"be", "appended", "to", "form", "a", "Sentence" };
		
		// Without String Builder
		String newStrFromSent = "";
		for (String str: strArr ) {
			// We are creating a new String everytime we do this
			newStrFromSent +=  str + " ";
		}
		System.out.println(newStrFromSent.trim());
		
		// GOOD Practice: With String Builder 
		
		StringBuilder strBuilderFromSent = new StringBuilder();
		
		for (String str: strArr) {
			// Just appending to an already existing object
			strBuilderFromSent.append(str);
			strBuilderFromSent.append(" ");
		}
		System.out.println(strBuilderFromSent.toString().trim());
	}
}
