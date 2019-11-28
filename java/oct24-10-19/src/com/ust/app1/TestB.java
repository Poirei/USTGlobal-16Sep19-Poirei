package com.ust.app1;

public class TestB {
	int a;
	static int b;
	
	{
		a = 100;
		b = 2;
		System.out.println("IIB 1.");
	}
	
	{
		System.out.println("IIB 2.");
	}
	
	public static void main(String[] args) {
		System.out.println("main() started.");
		
		for (int i = 0; i < 5; i++) {
			new TestB();
		}
		
		System.out.println("main() ended.");
	}
	
	static {
		System.out.println("SIB.");
	}
}
