package com.ustglobal.casting.reference;

public class Test {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.write();
		Pen p1 = new Marker();//Upcasting
		p1.write();
		Marker m = (Marker) p;//Downcasting
		m.write();
	}
}
