package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(45.09);
		al.add("Silencer");
		al.add("Ellen");
		al.add(true);
		
		System.out.println("Forward ------>");
		ListIterator li = al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("<------ Backward");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
	
}
