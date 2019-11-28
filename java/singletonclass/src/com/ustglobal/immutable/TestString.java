package com.ustglobal.immutable;

public class TestString {
	
	public static void main(String[] args) {
		MyString ms = new MyString(39, "Poirei");
		
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		System.out.println(ms.getClass().getName());
		System.out.println(ms.hashCode());
		
		MyString ms1 = ms.changeContent(30, "KPNS");
		System.out.println(ms1.hashCode());
	}
	
}
