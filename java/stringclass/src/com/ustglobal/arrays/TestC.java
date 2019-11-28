package com.ustglobal.arrays;

public class TestC {
	
	public static void main(String[] args) {
		Student s1 = new Student(101, "KPNS", 79.8);
		Student s2 = new Student(202, "BOB", 75.6);
		Student s3 = new Student(404, "Nobody", 98);
		
		Student[] stu_arr = {s1, s2, s3};
		
		for (Student s : stu_arr)
			System.out.println(s);
		
		System.out.println();
		receive(stu_arr);
	}
	
	static void receive(Student[] stu) {
		for (Student s : stu)
			System.out.println(s);
	}
}
