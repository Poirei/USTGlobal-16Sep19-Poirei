package com.ustglobal.sorting.map;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(101, "Son");
		ht.put(201, "Goku");
		ht.put(1000, "think");
		ht.put(893, "Gohan");
		ht.put(230, "Trunks");
		ht.put(110, "Roy");
		ht.put(786, "Khiladi");
//		ht.put(104, null); 			NullPointerException!
//		ht.put(null, null); 		NullPointerException!
//		ht.put(null, "flgkdfl"); 	NullPointerException!

		System.out.println(ht);
	}
}
