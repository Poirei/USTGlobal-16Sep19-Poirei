package com.ustglobal.sorting.list;

public class Student implements Comparable<Student>{
	int id;
	String name;
	double percentage;
	
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

	@Override
	public int compareTo(Student s) {
		
		Integer i1 = this.id;
		Integer i2 = s.id;
		
		return i1.compareTo(i2);
	}
	
}
