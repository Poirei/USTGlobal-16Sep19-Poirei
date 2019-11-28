package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestPen {
	
	public static void main(String[] args) {
		
		LinkedList<Pen> ll = new LinkedList<Pen>();
		
		Pen p1, p2, p3;
		
		p1 = new Pen(10.5, "Cello");
		p2 = new Pen(110, "Parker");
		p3 = new Pen(50, "Pilot");
		
		ll.push(p1);
		ll.add(p2);
		ll.add(p3);
		
		System.out.println("Before sorting : \n");
		displayPenDetails(ll);
		System.out.println("\nAfter sorting : \n");
		Collections.sort(ll);
		displayPenDetails(ll);
	}
	
	static void displayPenDetails(LinkedList<Pen> p) {
		ListIterator<Pen> litr = p.listIterator();
		
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
	}
}
