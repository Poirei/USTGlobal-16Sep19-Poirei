package com.ustglobal.stream.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Helper {
	
	Comparator<Student> c1 = (s1, s2) -> {
		return ((Double)s1.percentage).compareTo((Double)s2.percentage);
	};
	
	void displayAllStudent(ArrayList<Student> al) {
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student s = itr.next();
			System.out.println("Name : "+s.name);
			System.out.println("ID : "+s.id);
		}
	}
	
	void displayFailedStudents(ArrayList<Student> al) {
		List<Student> l = al.stream().filter(f -> f.percentage < 30).collect(Collectors.toList());
		
		for (Student s : l) {
			System.out.println(s);
		}
	}
	
	void displayPassedStudents(ArrayList<Student> al) {
		List<Student> l = al.stream().filter(f -> f.percentage > 30).collect(Collectors.toList());
		
		for (Student s : l) {
			System.out.println(s);
		}
	}
	
	void displayTopper(ArrayList<Student> al) {
		Student l = al.stream().max(c1).get();
		System.out.println("Best performer is : "+l.name+" with "+l.percentage+"%");
	}
	
	void displayLeast(ArrayList<Student> al) {
		Student l = al.stream().min(c1).get();
		System.out.println("Least performer is : "+l.name+" with "+l.percentage+"%");
	}
}
