package com.ustglobal.customizeduncheckedexception;

public class Validator {
	void verifyAge(int age) {
		if (age < 18) {
			throw new InvalidAgeException("try again after few years.");
		} else {
			System.out.println("Welcome to the party!!");
		}
	}
}
