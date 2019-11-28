package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Momo");
		al.add("Shreya");
		al.add(null);
		al.add("null");
//		al.add(123, null);
		
		String name = al.get(0);
		System.out.println(name.toUpperCase());
		
		Iterator<String> itr = al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next()+"--->"+itr.next().getClass().getSimpleName());
		}
		
		System.out.println("======Using listIterator().=====");
		
		ListIterator<String> li = al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("========Using for-each.=======");
		
		for (String s : al) {
			System.out.println(s);
		}
	}
}
