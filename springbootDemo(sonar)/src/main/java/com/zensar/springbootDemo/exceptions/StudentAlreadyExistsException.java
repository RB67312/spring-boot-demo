package com.zensar.springbootDemo.exceptions;

public class StudentAlreadyExistsException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StudentAlreadyExistsException() {
		super();
		
	}

	public StudentAlreadyExistsException(String message) {
		super(message);
	}
	
}
