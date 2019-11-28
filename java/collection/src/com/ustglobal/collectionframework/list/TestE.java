package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Shreya");
		
		Object o = al.get(0);
		System.out.println(o);
		String str = (String) o;
		String name = str.toUpperCase();
		System.out.println(name);
	}
}
