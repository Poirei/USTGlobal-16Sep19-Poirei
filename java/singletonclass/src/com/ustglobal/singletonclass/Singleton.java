package com.ustglobal.singletonclass;

public class Singleton {
	
	private static Singleton s;
	
	private Singleton() {
		
	}
	
	public static Singleton getDBConnection() {
		if (s == null) {
			s = new Singleton();
			return s;
		} else {
			return s;
		}
	}
	
}
