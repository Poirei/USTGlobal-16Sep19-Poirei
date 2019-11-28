package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestB {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(24.7);
		al.add("Egg");
		al.add('r');
		
		System.err.println("Object" + "\t" + "Type");
		for (Object obj : al) {
			System.out.println(obj + "\t" + obj.getClass().getSimpleName());
		}
	}
	
}
