package com.ustglobal.stream.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(34);
		al.add(42);
		al.add(54);
		al.add(78);
		al.add(65);
		
		List<Integer> l = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		
		for (Integer i : l) {
			System.out.println(i);
		}
	}
}
