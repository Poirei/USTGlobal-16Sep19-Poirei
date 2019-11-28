package com.ustglobal.stringbuffer;

public class TestStringBuffer {
	
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("King");
		sb1.append("-->");
		System.out.println(sb1);
		System.out.println(sb1.reverse());
	}
}
