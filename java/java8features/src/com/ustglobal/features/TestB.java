package com.ustglobal.features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
		
		Predicate<Student> p = s -> {
			if (s.percentage >= 35)
				return true;
			else
				return false;
		};
		
		Student s1 = new Student(120, "RyzenKPNS", 79.8);
		
		if (p.test(s1)) 
			System.out.println("pass");
		else
			System.out.println("fail");
		
	}
}
