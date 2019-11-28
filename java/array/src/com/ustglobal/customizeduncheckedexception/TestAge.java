package com.ustglobal.customizeduncheckedexception;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("Main started.");

		Validator v = new Validator();
		
		try {
			v.verifyAge(10);
		} catch (Exception e) {
			System.out.println(e);
		}
		

		System.out.println("Main ended.");
	}
}
