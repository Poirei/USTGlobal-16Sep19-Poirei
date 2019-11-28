package com.ustglobal.sorting.map;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("Kuka", 9968745);
		hm.put("Kaka", 984521);
		hm.put("Kiki", 882013);
		
		System.out.println("Data : " + hm);
		
		hm.put("Kaka", 589485);
		System.out.println("After modify : \n");
		
		System.out.println(hm);
		hm.put("Naga", 589485);
		System.out.println(hm);
		hm.put("Yo", null);
		System.out.println(hm);
		hm.put(null, 45612);
		hm.put(null, 45454);
		System.out.println(hm);
		System.out.println("\nValue of Yo : " + hm.get("Yo"));
		System.out.println("Value of King : " + hm.get("King"));
		System.out.println("Value of Kuka : " + hm.get("Kuka"));
		
		System.out.println(hm.remove("Kiki"));
		System.out.println(hm);
	}
}
