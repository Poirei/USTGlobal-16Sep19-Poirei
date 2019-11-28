package com.ustglobal.features.consumer;

import java.util.function.Consumer;

import com.ustglobal.features.Student;

public class TestA {
	public static void main(String[] args) {
		
		Consumer<Student> c = s -> {
			System.out.println("Name : "+s.name);
			System.out.println("ID : "+s.id);
			System.out.println("Percentage : "+s.percentage);
		};
		
		c.accept(new Student(104, "Accelerator", 96.96));
	}
}
