package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestL {
	public static void main(String[] args) {

		Comparator<Employee1> com = (e1, e2) -> {
			return e1.name.compareTo(e2.name);
		};

		TreeSet<Employee1> ts = new TreeSet<Employee1>(com);

		Employee1 e1 = new Employee1(101, "KPNS", 56000);
		Employee1 e2 = new Employee1(102, "Hulk", 65000);
		Employee1 e3 = new Employee1(103, "Stark", 78000);
		Employee1 e4 = new Employee1(104, "Steve", 80000);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println("(((((((((((Using iterator)))))))))))))\n");
		Iterator<Employee1> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
