package com.ustglobal.assignment.collection;

public class Student {
	int id;
	int rollNo;
	String name;
	long contact;
	String email;
	
	public Student(int id, int rollNo, String name, long contact, String email) {
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.contact = contact;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNo=" + rollNo + ", name=" + name + ", contact=" + contact + ", email="
				+ email + "]";
	}

	public static void main(String[] args) {
		Student s1, s2, s3, s4, s5;
		
		s1 = new Student(1, 71, "Poirei", 9791301081L, "poirei4@gmail.com");
		s2 = new Student(2, 65,"KPNS", 7013070619L, "poirei4@hotmail.com");
		s3 = new Student(3, 61, "Ryzen", 699832546L, "ryzenstar1@kickass.org");
		s4 = new Student(4, 36, "Mark", 9876543210L, "mark@thepiratebay.org");
		s5 = new Student(5, 100, "Cyrus", 0000011101L, "cyrus.xoxo@thehackergroup.org");
		
		Object[] objArr = {s1, s2, s3, s4, s5};
		
		System.out.println("~~~~~~~~~~Using for loop~~~~~~~~~\n");
		for (int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i]);
		}
		
		System.out.println("\n~~~~~~~~~~Using for-each loop~~~~~~~~~\n");
		for (Object s : objArr) {
			System.out.println(s);
		}
	}
}
