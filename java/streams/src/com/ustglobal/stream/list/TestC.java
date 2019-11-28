package com.ustglobal.stream.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(50);
		al.add(2);
		al.add(56);
		al.add(46);
		al.add(10);
		
		List<Integer> l = al.stream().map(i -> i + 50).collect(Collectors.toList());
		System.out.println(l);
	}
}
