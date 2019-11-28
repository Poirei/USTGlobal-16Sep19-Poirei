package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {
	
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		
		al.add((double) 23);
		al.add(23.5);
		al.add(39.63);
		al.add(54.131);
		al.add(4545.2578);
		al.add(23.5);
		al.add(null);
		al.add(45.68);
		
		System.out.println(al);
		
		al.add(2, 25.56);
		System.out.println("after add in 2nd index : \n" + al);
		al.remove(0);
		System.out.println(al);
		al.remove(54.131);
		System.out.println(al);
		System.out.println(al.get(4));
		al.set(4, 24.5);
		System.out.println(al);
//		al.clear();
		System.out.println(al);
		System.out.println(al.contains(null));
		
		List<Double> al1 = new ArrayList<Double>();
		
		al1.add(45.67);
		al1.add(20.39);
		al.add(45.97);
		al.add(65.32);
		
		al.addAll(al1);
		System.out.println(al);
		
		System.out.println(al.containsAll(al1));
		
		al.removeAll(al1);
		System.out.println(al);
	}
	
}
