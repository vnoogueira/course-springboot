package com.example.course.services.exception;

public class DatabaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String msg;

	public DatabaseException(String msg) {
		super(msg);
	}

}
