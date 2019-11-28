package com.ustglobal.sorting.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		
		Student s1 = new Student("Poirei", 101, 79.8);
		Student s2 = new Student("King", 102, 74.8);
		Student s3 = new Student("Leo", 103, 75.8);
		Student s4 = new Student("Aquarius", 104, 76.8);
		Student s5 = new Student("Taurus", 105, 80.8);
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		al1.add(s4);
		al1.add(s5);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		hm.put("first", al);
		hm.put("second", al1);
		
		ArrayList<Student> second = hm.get("second");
		Iterator<Student> itr = second.iterator();
		while (itr.hasNext()) {
			System.out.println("Name : " + itr.next().name);
			System.out.println("ID : " + itr.next().id);
			System.out.println("Percentage : " + itr.next().percentage);
		}
	}
}
