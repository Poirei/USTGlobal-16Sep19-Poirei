package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {
		int[] nums = {10, 20, 50, 70, 80};
		print(nums);
		System.out.println();
		int[] received_arr = getArray();
		String[] str = getStrArr();
		
		for (int i : received_arr)
			System.out.print(i + " ");
		
		System.out.println("\n");
		for (String st : str)
			System.out.print(st + " ");
	}
	
	static void print(int[] arr) {
		for (int i : arr)
			System.out.println(i);
	}
	
	static int[] getArray() {
		int[] values = {20, 30, 40, 50, 60, 70, 80};
		return values;
	}
	
	static String[] getStrArr() {
		String[] str_arr = {"KPNS", "kpns", "king", "jack", "joker"};
		return str_arr;	
	}
	
	static void printStr(String[] str_arr) {
		for (String str : str_arr)
			System.out.print(str + "----");
	}
}
                  																																													