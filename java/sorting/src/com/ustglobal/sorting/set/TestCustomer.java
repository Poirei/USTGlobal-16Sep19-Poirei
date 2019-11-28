package com.ustglobal.sorting.set;

import java.util.TreeSet;

public class TestCustomer {
	public static void main(String[] args) {
		
		TreeSet<Customer> ts = new TreeSet<Customer>(new SortByName1());
		
		Customer c1 = new Customer(123, "RyzenKpns", 450000);
		Customer c2 = new Customer(456, "Naruto", 320000);
		Customer c3 = new Customer(789, "Itachi", 550000);
		Customer c4 = new Customer(100, "Minato", 680000);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		for (Customer c : ts) {
			System.out.println(c);
		}
	}
}
