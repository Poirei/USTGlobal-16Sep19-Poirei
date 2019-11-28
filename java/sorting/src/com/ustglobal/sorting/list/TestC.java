package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(12);
		ll.add(42);
		ll.add(25);
		ll.add(54);
		ll.add(65);
		
		System.out.println("List=====>" + ll + "\n");
		
		Integer peekElement = ll.peek();
		System.out.println("Peek element : " + peekElement);
		System.out.println("Peek first element : " + ll.peekFirst());
		System.out.println("Peek last element : " + ll.peekLast() + "\n");
		
		System.out.println("<----Before polling ---->\n");
		System.out.println(ll + "\n");
		
		System.out.println("Poll element : " + ll.poll());
		System.out.println("Poll first element : " + ll.pollFirst());
		System.out.println("Poll last element : " + ll.pollLast() + "\n");
		
		System.out.println("<----After polling ---->\n");
		System.out.println(ll);
		
		ll.push(27);
		System.out.println("After push(12) : \n" + ll);
		
		System.out.println(ll.pop());
		
		System.out.println("After pop() : \n" + ll);
	}
}
