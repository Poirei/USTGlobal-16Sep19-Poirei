package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet();
		
		ts.add("Diwali");
		ts.add("Durag Puja");
		ts.add("Dussehra");
		ts.add("Muharram");
		ts.add("Halloween");
		
		for (String s : ts) {
			System.out.println(s);
		}
		
		System.out.println("=====================================================================================================================");
		
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
