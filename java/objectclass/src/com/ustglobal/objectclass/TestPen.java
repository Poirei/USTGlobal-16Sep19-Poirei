package com.ustglobal.objectclass;

public class TestPen {
	public static void main(String[] args) {
		
		Pen p = new Pen();
		System.out.println("pHashcode = " + p.hashCode());
		p.write();
		
		Pen q = new Pen();
		System.out.println("qHashcode = " + q.hashCode());
		
		System.out.println();
	}
}
