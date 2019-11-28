package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		Integer i = a;
		Double d = new Double(39.39);
		
		System.out.println(i + " \t" + d);
		
		Integer x = 20;//Autoboxing
		Integer z = new Integer(40);
		System.out.println("x is : " + x);
		int y = z;//Auto-unboxing
		System.out.println("y is : " + y);
		Double b = 45.98;
		double e = d;
		
		int value = Integer.parseInt("24");
		System.out.println("Value = " + value);
		
		boolean bool = Boolean.parseBoolean("true");
		System.out.println("Boolean = " + bool);
		
		int val = Integer.parseInt("123str");
	}
	
}
