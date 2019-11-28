package com.ustglobal.features.supplier;

import java.util.function.Supplier;

import com.ustglobal.features.Student;

public class TestA {
	public static void main(String[] args) {
		
		Supplier<Student> s = () -> new Student(2, "Ajay", 65.6);
		
		Student s1 = s.get();
		System.out.println("Name : "+s1.name);
		System.out.println("ID : "+s1.id);
		System.out.println("Percentage : "+s1.percentage);
		
		Supplier<Integer> i = () -> 20;
		int val = i.get();
		System.out.println("Value : "+val);
		
		Supplier<String> s11 = () -> "String";
		System.out.println(s11.get());
	}
}
