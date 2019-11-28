package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(101, "Poirei", 79.8);
		Student s2 = new Student(123, "KPNS", 89.9);
		Student s3 = new Student(456, "King", 79);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for (int i = 0; i < al.size(); i++) {
			
			System.out.println("ID is : " + al.get(i).id);
			System.out.println("Name is : " + al.get(i).name);
			System.out.println("Percentage is : " + al.get(i).percentage);
			
		}
		
		System.out.println("--------Using for each loop-----------");
		
		for (Student s : al) {
			System.out.println(s);
		}
	}
}
