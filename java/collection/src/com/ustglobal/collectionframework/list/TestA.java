package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(24);
		al.add(45.8f);
		al.add("String");
		al.add('e');
		al.add(true);
		al.add(9791301081L);
		al.add(45.75986598);
		al.add(null);
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i) + " " + al.get(i).getClass().getSimpleName());
		}
	}
}
