package com.ustglobal.arrays;

import java.util.Scanner;

public class TestArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nos = new int[5];
		Object[] ob_arr = new Object[2];
		ob_arr[0] = 10;
		ob_arr[1] = "KPNS";
		System.out.println("Enter the nos : ");
		for (int i = 0; i < nos.length; i++) {
			nos[i] = sc.nextInt();
		}
		
		for (int i = 0; i < nos.length; i++) {
			System.out.print(nos[i] + " ");
		}
		
		System.out.println();
		for (Object obj : ob_arr)
			System.out.print(obj+ " ");
		
		System.out.println();
		boolean[] b_arr = {true, false};
		for (boolean b : b_arr)
			System.out.println(b);
		
		String booLean = "truefalse";
		char[] char_arr = booLean.toCharArray();
		for (char c : char_arr)
			System.out.print(c + " ");
		System.out.println();
		
		byte[] byte_arr = {10, 30, 127, -27};
		for (byte b : byte_arr)
			System.out.print(b + " ");
		
		String[] str_arr = {"abc", "cde", "fgh"};
		for (String str : str_arr)
			System.out.print(str + " ");
		
		sc.close();
	}
}
