package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
	public static void main(String[] args) {
		Stack ll = new Stack();


		ll.add(123);
		ll.add("Str");
		ll.add(45.36);
		ll.add(true);
		ll.add(true);

		System.out.println("+++++++++Using for loop++++++++");

		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
		}

		System.out.println("+++++++++Using for each loop+++++++++++");

		for (Object o : ll) {
			System.out.println(o);
		}

		System.out.println("+++++++++Using iterator()+++++++++++");

		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("+++++++++Using listIterator()++++++++++++");
		System.out.println("Forward----->");

		ListIterator li = ll.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("<-----Backward");

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
