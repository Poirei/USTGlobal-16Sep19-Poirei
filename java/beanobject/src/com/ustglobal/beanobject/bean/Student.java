package com.ustglobal.beanobject.bean;

public class Student {
	private int id;
	private int rollNo;
	private String name;
	
	public Student() {
		System.out.println("Student() constructor.");
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
