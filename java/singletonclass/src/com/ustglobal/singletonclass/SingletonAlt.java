package com.ustglobal.singletonclass;

public class SingletonAlt {
	
	private static SingletonAlt s;
	
	private SingletonAlt() {}
	
	static {
		s = new SingletonAlt();
	}
	
	public static SingletonAlt getDBConnection() {
		return s;
	}
	
}
