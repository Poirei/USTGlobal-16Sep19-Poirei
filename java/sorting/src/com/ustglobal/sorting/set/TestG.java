package com.ustglobal.sorting.set;

//import java.util.Collections;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestG {
	public static void main(String[] args) {
		TreeSet<Employee> hs = new TreeSet<Employee>();
		
		Employee e1, e2, e3, e4, e5;
		e1 = new Employee(101, "KPNS", 350000);
		e2 = new Employee(102, "KIng", 650000);
		e3 = new Employee(103, "Martin", 320000);
		e4 = new Employee(104, "Mary", 500000);
		e5 = new Employee(104, "Mary", 500000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("Using for each =======>\n");
		for (Employee e : hs) {
			System.out.println(e);
		}
		
		System.out.println("\nUsing iterator() ========>\n");
		Iterator<Employee> itr = hs.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
