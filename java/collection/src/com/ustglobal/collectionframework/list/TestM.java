package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Ganga");
		al.add("Like");
		al.add("KPNS");
		al.add("String");
		
		System.out.println("Before sorting =====> \n" + al);
		Collections.sort(al);
		System.out.println("After sorting =====> \n" + al);
	}
}
