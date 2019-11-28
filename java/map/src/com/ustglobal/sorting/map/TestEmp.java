package com.ustglobal.sorting.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class TestEmp {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "Ricochet", 58000);
		Employee e2 = new Employee(11, "Jax", 74300);
		Employee e3 = new Employee(12, "Rose", 46000);
		Employee e4 = new Employee(13, "Martin", 78000);
		Employee e5 = new Employee(14, "LOLO", 56000);
		Employee e6 = new Employee(15, "Marcus", 90000);
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		
		al2.add(e4);
		al2.add(e5);
		al2.add(e6);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<String, ArrayList<Employee>>();
		
		hm.put("First", al1);
		hm.put("Second", al2);
		
		ArrayList<Employee> ale = hm.get("First");
		
		for (Employee e : ale) {
			System.out.println(e);
		}
		
		Iterator itr = ((List<Employee>) hm).iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
