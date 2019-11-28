package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("34");
		hs.add("Poirei");
		hs.add("Ngamba");
		hs.add("Singha");
		hs.add("Silchar");
		hs.add("Kabuganj");
		
		System.out.println("Using for each ++++++++++++++++\n");
		for (String s : hs) {
			System.out.println(s);
		}
		
		System.out.println("\nUsing iterator() ++++++++++++++++\n");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
