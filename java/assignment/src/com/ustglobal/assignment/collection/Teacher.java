package com.ustglobal.assignment.collection;

public class Teacher {
	String name;
	String subject;
	
	@Override
	public String toString() {
		return "The name of " + subject + " teacher is " + name;
	}
	
	public Teacher(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}
	
}
