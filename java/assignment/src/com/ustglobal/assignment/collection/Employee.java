/**
 * 
 */
package com.ustglobal.assignment.collection;

/**
 * @author Poirei
 *
 */
public class Employee {
	
	int id;
	int salary;
	String name;
	
	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "The id of " + name + " is " + id + " and salary is \u20B9" + salary;
	}
	
}
