package com.ustglobal.exception.first;

public class TestA {
	public static void main(String[] args) {
		System.out.println("Main started.");
		
		int a = 10;
		int b = 0;
		
		try {
			b = 10/0;
			System.out.println("Hello!");
		}
		catch (Exception e) {
			System.out.println("Illegal denominator.");
		}
		System.out.println(b);
		System.out.println("Main ended.");
	}
}
