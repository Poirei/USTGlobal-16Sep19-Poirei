package com.ustglobal.assignment.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestTeacher {

	public static void main(String[] args) {
		LinkedList<Teacher> al = new LinkedList<Teacher>();

		Teacher t1, t2, t3;

		t1 = new Teacher("Raghu", "Programming");
		t2 = new Teacher("Nagesh", "SQL");
		t3 = new Teacher("Shishira", "Java");

		al.add(t1);
		al.add(t2);
		al.add(t3);

		System.out.println("======Using iterator()======\n");
		Iterator<Teacher> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}System.out.println();

		System.out.println("=====Using listIterator()=====\n");
		ListIterator<Teacher> litr = al.listIterator();

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
		for (Teacher e : al) {
			System.out.println(e);
		}
	}

}
