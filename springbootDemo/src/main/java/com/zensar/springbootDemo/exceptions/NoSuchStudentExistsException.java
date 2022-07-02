package com.zensar.springbootDemo.exceptions;

public class NoSuchStudentExistsException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NoSuchStudentExistsException() {
		super();

	}

	public NoSuchStudentExistsException(String message) {
		super(message);
	}

}
