package com.test.four;

/**
 * The exception class
 * @author Anish
 *
 */
public class InvaliedResponseCodeException extends Exception {

	/**
	 * A unique serial version identifier
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Default constructor
	 */
	public InvaliedResponseCodeException() {
		super();
	}

	/**
	 * Parameterized constructor 
	 * @param message
	 */
	public InvaliedResponseCodeException(String message) {
		super(message);
	}

	
	
	

}
