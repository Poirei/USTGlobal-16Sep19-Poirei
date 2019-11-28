package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStudent {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1, s2, s3, s4;
		
		s1 = new Student(1, "Poirei", 79.8);
		s2 = new Student(2, "King", 98);
		s3 = new Student(3, "LoL", 100);
		s4 = new Student(4, "HaHa", 200);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		displayStudentDetails(al);
		
		Collections.sort(al);
		
		displayStudentDetails(al);
	}
	
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> itr = al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
