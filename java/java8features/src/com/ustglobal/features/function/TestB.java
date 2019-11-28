package com.ustglobal.features.function;
import java.util.function.Function;

import com.ustglobal.features.Student;
public class TestB {
	public static void main(String[] args) {
		
		Function<Integer, Student> f = id -> {
			Student s = new Student(2, "Vijay", 101);
			s.id = id;
			return s;
		};
		
		Student s = f.apply(4);
		System.out.println("ID : "+s.id);
		System.out.println("Name : "+s.name);
		System.out.println("Percentage : "+s.percentage);
	}
}
