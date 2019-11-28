package com.ustglobal.stringclass;

public class TestString {
	public static void main(String[] args) {
		
		String s1 = "aishu";
		String s2 = "Aishu";
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		
		String s3 = new String("Tom");
		String s4 = new String("Tim");
		System.out.println(s3.hashCode() + " " + s4.hashCode());
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		System.out.println(s2.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s4.charAt(2));
		System.out.println(s4.concat(s3));
		System.out.println(s1.contains("u"));
	}
}
