package com.ust.app1;

public class TestA {
	static int a;
	
	static {
		a = 10;
		System.out.println("static block 1.");
	}
	
	static {
		a = 20;
		System.out.println("static block 2.");
	}
	
	TestA() {
		System.out.println("TestA() constructor.");
	}
	
	static {
		a = 100;
		System.out.println("static block 3.");
	}
	
	public static void main(String[] args) {
		TestA t = new TestA();
		TestA t1 = new TestA();
		System.out.println("a = "+a);
	}
}
