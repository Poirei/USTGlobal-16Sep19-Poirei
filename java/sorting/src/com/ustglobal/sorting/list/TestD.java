package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {
	
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.add(23);
		s.push(65);
		s.push(35);
		
		System.out.println(s);
		
		System.out.println("Using get() ------> \n");
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		int j = s.size();
		System.out.println("Using pop() -----> \n");
		for (int i =0; i<j; i++) {
			System.out.println(s.pop());
		}
		
	}
	
}
