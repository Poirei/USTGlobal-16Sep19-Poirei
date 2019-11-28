package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLaptop {
	public static void main(String[] args) {
		LinkedList<Laptop> ll = new LinkedList<Laptop>();
		
		Laptop l1, l2, l3, l4;
		
		l1 = new Laptop(85000, "ROG", 32);
		l2 = new Laptop(56500, "Asus", 16);
		l3 = new Laptop(43300, "hp", 8);
		l4 = new Laptop(120000, "Alienware", 64);
		
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		ll.add(l4);
		ll.add(new Laptop(78000, "Apple", 16));
		
		System.out.println("Before sorting : \n");
		laptopDetails(ll);
		System.out.println("\n+++++++++++++++++++++\n");
		Collections.sort(ll);
		
		System.out.println("After sorting : \n");
		laptopDetails(ll);
		
	}
	
	static void laptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> itr = l.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
