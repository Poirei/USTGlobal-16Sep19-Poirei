package com.ustglobal.assignment.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestEmployee {
	
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		Employee e1, e2, e3;
		
		e1 = new Employee(101, 450000, "Poirei");
		e2 = new Employee(102, 500000, "King");
		e3 = new Employee(103, 650000, "Ryzen");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println("======Using iterator()======\n");
		Iterator<Employee> itr = al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}System.out.println();
		
		System.out.println("=====Using listIterator()=====\n");
		ListIterator<Employee> litr = al.listIterator();
		
		System.out.println("Forward----->");
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}System.out.println();
		System.out.println("<-----Backward");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}System.out.println();
		
		System.out.println("=====Using for loop=====\n");
		for (int i = 0; i <= al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("====Using for-each loop=====\n");
		for (Employee e : al) {
			System.out.println(e);
		}
	}
	
}
