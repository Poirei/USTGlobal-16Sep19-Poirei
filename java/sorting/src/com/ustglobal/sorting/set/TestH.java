package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
	public static void main(String[] args) {
		
		TreeSet<Bank> ts = new TreeSet<Bank>(new SortByMicr());
		
		Bank b1 = new Bank("Canara", 89787, 560076);
		Bank b2 = new Bank("Axis", 8952031, 560087);
		Bank b3 = new Bank("HDFC", 8956031, 560088);
		Bank b4 = new Bank("ICICI", 89520, 560110);
		Bank b5 = new Bank("ICICI", 89520, 560110);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		for (Bank b : ts) {
			System.out.println(b);
		}
		
		Iterator<Bank> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
