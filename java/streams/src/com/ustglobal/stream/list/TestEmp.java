package com.ustglobal.stream.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestEmp {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		Employee e1 = new Employee(120, "KPNS");
		Employee e2 = new Employee(320,"DOG");
		Employee e3 =new Employee(320,"dfdf");
		Employee e4= new Employee(321, "G");
		Employee e5= new Employee(322, "G");
		
		Comparator<Employee> c = (e11,e21)-> {
			return e11.name.compareTo(e21.name);
		};
		
		
	}
}
