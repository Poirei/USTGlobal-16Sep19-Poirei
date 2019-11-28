package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(23);
		ts.add(30);
		ts.add(56);
		ts.add(90);
		ts.add(20);
		ts.add(99);
		
		System.out.println("Using for each ======>");
		for (Object o : ts) {
			System.out.println(o);
		}
		
		System.out.println("Using iterator() ======>");
		
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
