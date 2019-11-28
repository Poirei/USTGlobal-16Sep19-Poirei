package com.ustglobal.typecasting;

public class TestA {
	public static void main(String[] args) {
		byte a = 10;
		int i = a;
		System.out.println(i);
		
		byte b =(byte) i;
		System.out.println(b);
		
		int p = 20;
		double q = p;
		System.out.println(q);
		
		char c = '$';
		int t = c;
		System.out.println(t);
		char r = (char) t;
		System.out.println(r);
		
		long l = 49L;
		int n = (int) l;
		
		l = c;
		c = (char) l;
		
		q = c;
		System.out.println(q);
		c = (char) q;
	}
}
