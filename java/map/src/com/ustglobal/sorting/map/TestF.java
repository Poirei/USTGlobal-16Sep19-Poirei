package com.ustglobal.sorting.map;

import java.util.Map;
import java.util.TreeMap;

public class TestF {
	public static void main(String[] args) {

		TreeMap<String, Integer> lhm = new TreeMap<String, Integer>();

		lhm.put("Bangalore", 560076);
		lhm.put("Silchar", 788007);
		lhm.put("Chennai", 688521);
		
		for (Map.Entry<String, Integer> m : lhm.entrySet()) {
			System.out.println("Key : " + m.getKey() + ", Value : " + m.getValue());
		}
	}
}
