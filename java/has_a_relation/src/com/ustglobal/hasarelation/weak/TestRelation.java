package com.ustglobal.hasarelation.weak;

public class TestRelation {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.m.write();//Has-A relation
		System.out.println(p.m.color);//Has-A relation
		p.sleep();
		p.eat();
	}
}
