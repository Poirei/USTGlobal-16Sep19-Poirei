package com.ustglobal.hasarelation.weak;

public class Person {
	String name;
	Marker m = new Marker();
	
	void sleep() {
		System.out.println("Person sleeps.");
	}
	
	void eat() {
		System.out.println("Person eats.");
	}
}
