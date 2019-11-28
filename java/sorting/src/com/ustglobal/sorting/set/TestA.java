package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(23);
		hs.add(23);
		hs.add(24);
		hs.add(null);
		hs.add(null);
		hs.add(26);
		hs.add("Str");
		hs.add(23.56);
		hs.add(new String());
		hs.add('\u20B9');
		hs.add(0);
		
		System.out.println("Using for each ------->\n");
		
		for (Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("Using Iterator ------->\n");
		
		Iterator itr = hs.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
