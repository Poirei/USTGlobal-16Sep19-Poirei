package com.ustglobal.customizeduncheckedexception;

public class InvalidAgeException extends RuntimeException {

	private String message = "Invalid age. Below 18years not allowed.";

	@Override
	public String getMessage() {
		return message;
	}
	
	public InvalidAgeException() {}
	
	public InvalidAgeException(String message) {
		this.message = message;
	}
}
