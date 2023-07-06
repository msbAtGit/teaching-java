package com.fssa.learnJava.corejava.day10;

/**
 * Custom exception to handle cases when 
 * there are exception during validation
 * 
 * @author BharathwajSoundarara
 *
 */
public class ValidationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8105491977357554060L;

	// Calling each super constructors for each of the types
	public ValidationException(String msg) {
		super(msg);
	}

	public ValidationException(Throwable te) {
		super(te);
	}

	public ValidationException(String msg, Throwable te) {
		super(msg, te);
	}
}
