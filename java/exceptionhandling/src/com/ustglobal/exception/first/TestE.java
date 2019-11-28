package com.ustglobal.exception.first;

public class TestE {
	public static void main(String[] args) {
		System.out.println("Main started.");
		
		String s = "hello";
		int[] a = {10, 20, 30};
		int b = 10;
		
		try {
			String s1 = s.toUpperCase();
			System.out.println(a[7]);
			System.out.println(b/0);
		} catch (NullPointerException npe) {
			System.out.println("Don't play with null.");
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("Invalid index.");
		} catch (ArithmeticException ae) {
			System.out.println("Not a valid divisor.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main ended.");
	}
	
}
