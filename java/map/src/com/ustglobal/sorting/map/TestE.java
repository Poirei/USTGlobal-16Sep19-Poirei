package com.ustglobal.sorting.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestE {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();

		lhm.put("Bangalore", 560076);
		lhm.put("Silchar", 788007);
		lhm.put("Chennai", 688521);
		
		for (Map.Entry<String, Integer> m : lhm.entrySet()) {
			
			String s = m.getKey();
			Integer i = m.getValue();
			
			System.out.println("Key = " + s + ", Value = " + i);
		}
	}
}
