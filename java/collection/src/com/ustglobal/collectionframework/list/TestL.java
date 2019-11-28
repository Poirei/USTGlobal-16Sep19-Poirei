package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(32);
		l.add(65);
		l.add(98);
		l.add(39);
		l.add(100);
		
		System.out.println("Before sorting : \n" + l);
		Collections.sort(l);
		System.out.println("After sorting : \n" + l);
		
		Collections.reverse(l);System.out.println("After reversing : \n" + l);
		
		Collections.shuffle(l);
		System.out.println(l);
	}
}
