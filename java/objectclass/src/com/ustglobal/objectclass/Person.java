package com.ustglobal.objectclass;

public class Person extends Object implements Cloneable{
	int id;
	String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (this.id == ((Person) obj).id)
			return true;
		else
			return false;
	}
	
	
}
