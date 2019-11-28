package com.ustglobal.sorting.map;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("Kuka", 9968745);
		hm.put("Kaka", 984521);
		hm.put("Kiki", 882013);

		HashMap hm1 = new HashMap();
		hm1.put("Deep", 4646);
		hm1.put("Dark", 7943);
		hm1.put("Light", 01213);

		boolean b = hm.containsKey("Kiki");
		System.out.println(b);

		System.out.println(hm1.containsValue(4646));

		hm.putAll(hm1); System.out.println(hm);

		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		hm.clear();
		System.out.println(hm.isEmpty());
	}
}
