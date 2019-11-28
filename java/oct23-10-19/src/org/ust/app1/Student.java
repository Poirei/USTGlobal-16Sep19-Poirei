package org.ust.app1;

public class Student extends Person{
	int rollNo;
	String collegeName;
	
	public Student(int rollNo, String collegeName) {
		super("Poirei", 24);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Roll No. : " + rollNo + ", College Name : " + collegeName;
	}
}
