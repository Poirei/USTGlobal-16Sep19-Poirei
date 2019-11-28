package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MarkerTest {
	
	public static void main(String[] args) {
		
		ArrayList<Marker> al = new ArrayList<Marker>();
		
		al.add(new Marker(60, "Green"));
		al.add(new Marker(20, "Black"));
		al.add(new Marker(40, "Blue"));
		al.add(null);
		al.add(new Marker(30, "Red"));
		
		System.out.println("Before sorting ====>\n");
		display(al);
		
		SortByPrice sbp = new SortByPrice();
		SortByColor sbc = new SortByColor();
		
		Collections.sort(al, sbc);
		System.out.println("After sorting ====>\n");
		display(al);
		
	}
	
	static void display(ArrayList<Marker> m) {
		Iterator<Marker> itr = m.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
