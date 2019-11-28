package com.ustglobal.sorting.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestD {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		
		lhm.put("Bangalore", 560076);
		lhm.put("Silchar", 788007);
		lhm.put("Chennai", 688521);
		
		System.out.println(lhm);
		
		Set<String> set = lhm.keySet();
		System.out.println("Keys---->\n");
		for (String s : set) {
			System.out.println(s);
		}
		
		Collection<Integer> l = lhm.values();
		System.out.println("\nValues----->\n");
		for (Integer i : l) {
			System.out.println(i);
		}
	}
}
