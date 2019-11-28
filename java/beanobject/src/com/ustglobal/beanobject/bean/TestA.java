package com.ustglobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(10);
		s.setName("Poirei");
		s.setRollNo(39);
		System.out.println("==================*");
		
		Database db = new Database();
		db.receive(s);
		
		Employee e = new Employee();
		e.setId(404);
		e.setName("RyzenKPNS");
		e.setSalary(45000);
		db.save(e);
	}
}
