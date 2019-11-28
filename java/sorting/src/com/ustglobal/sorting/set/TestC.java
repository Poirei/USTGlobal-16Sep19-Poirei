package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add('\u20B9');
		lhs.add(23);
		lhs.add("String");
		lhs.add(45.9);
		lhs.add('\u20B9');
		lhs.add(new String("()==()\n   >"));
		lhs.add(null);
		
		for (Object o : lhs) {
			System.out.println(o);
		}
		
		Iterator itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
