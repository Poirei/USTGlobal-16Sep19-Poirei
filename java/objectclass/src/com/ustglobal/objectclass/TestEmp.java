package com.ustglobal.objectclass;

public class TestEmp {
	public static void main(String[] args) {
		Employee e = new Employee(101, "Poirei", 50000.67);
		Employee e1 = e;
		System.out.println(e1.equals(e));
	}
}
