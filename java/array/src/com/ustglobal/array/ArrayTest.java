package com.ustglobal.array;

public class ArrayTest {
	public static void main(String[] args) {
		Object[][] obj_arr = allArr();
		
		for (Object[] obj : obj_arr)
			for (Object ob : obj)
				System.out.println(ob);
	}
	
	public static Object[][] allArr() {
		Integer[] a = {1, 2, 3, 4};
		String[] str = {"KPNS", "Rider"};
		Object[][] objArr = {a, str};
		return objArr;
	}
}
