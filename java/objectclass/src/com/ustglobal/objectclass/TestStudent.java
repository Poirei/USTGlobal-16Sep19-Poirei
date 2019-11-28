package com.ustglobal.objectclass;

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student(39, "Poirei", 79.80);
		System.out.println(s);
		System.out.println(" " + s.hashCode());
	}
}
