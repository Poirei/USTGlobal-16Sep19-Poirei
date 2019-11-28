package com.ustglobal.singletonclass;

public class TestSingleton {
	
	public static void main(String[] args) {
		Singleton s = Singleton.getDBConnection();
		Singleton s1 = Singleton.getDBConnection();
		
		System.out.println(s);
		System.out.println(s1);
		
		SingletonAlt s11 = SingletonAlt.getDBConnection();
		SingletonAlt s12 = SingletonAlt.getDBConnection();
		
		System.out.println(s11.hashCode());
		System.out.println(s12.hashCode());

		
	}
	
}
