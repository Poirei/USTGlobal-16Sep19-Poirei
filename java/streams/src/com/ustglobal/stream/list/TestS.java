package com.ustglobal.stream.list;

import java.util.ArrayList;

public class TestS {
 public static void main(String[] args) {
	
	 ArrayList<Student> al = new ArrayList<>();
	 al.add(new Student(5, "POIrei", 89.36));
	 al.add(new Student(6, "POui", 45.36));
	 al.add(new Student(67, "Perrei", 46));
	 al.add(new Student(34, "Poirier", 100));
	 al.add(new Student(10, "Dustin", 98.45));
	 al.add(new Student(2, "Raul", 67));
	 al.add(new Student(8, "koei", 89));
	 
	 Helper h = new Helper();
	 h.displayAllStudent(al);
	 
	 System.out.println("Failed students : \n");
	 h.displayFailedStudents(al);
	 
	 h.displayLeast(al);
	 h.displayTopper(al);
}
}
