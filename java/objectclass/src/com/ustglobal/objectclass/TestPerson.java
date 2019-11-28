package com.ustglobal.objectclass;

public class TestPerson {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person(101, "RyzenKPNS");
		Person p1 = new Person(104, "Raiden");
		
		Object o1 = p.clone();
		Person p2 = (Person) o1;
		p2.id = 106;
		p2.name = "Liu Kang";
		
		System.out.println("ID\tName");
		System.out.println(p.id + "\t\t" + p2.id);
		System.out.println(p.name + "\t" + p2.name);
		
		System.out.println(p.equals(p2));
	}
}
