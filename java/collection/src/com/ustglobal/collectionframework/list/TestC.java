package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(23);
		al.add("duke");
		al.add(45.3);
		
		System.out.println("Using iterator() method.");
		
		Iterator i = al.iterator();
		Object o1 = i.next();
		System.out.println("Object1 : " + o1);
		Object o2 = i.next();
		System.out.println("Object2 : " + o2);
		Object o3 = i.next();
		System.out.println("Object3 : " + o3);
		if (i.hasNext())
			System.out.println("More objects.");
		else
			System.out.println("No more objects.");
		
		ArrayList al1 = new ArrayList();
		al1.add(25);
		al1.add(99.99);
		al1.add("String");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
