package com.ustglobal.exception.customcheckedexception;

public class InvalidAmountException extends Exception {
	
	private String message = "Invalid amount.";
	
	@Override
	public String getMessage() {
		return message;
	}
}
