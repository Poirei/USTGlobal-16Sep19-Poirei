package com.ustglobal.sorting.set;

import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet<Double> d = new LinkedHashSet<Double>();
		
		d.add(23.78);
		d.add(45.313);
		d.add(63.413443545323435324354312435423245453432453421213);
		
		for (Double db : d) {
			System.out.println(db);
		}
	}
}
