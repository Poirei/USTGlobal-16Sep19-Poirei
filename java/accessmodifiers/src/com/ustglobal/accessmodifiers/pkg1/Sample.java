package com.ustglobal.accessmodifiers.pkg1;

import com.ustglobal.accessmodifiers.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
		Sample s = new Sample();
		
		System.out.println(s.d);
		s.mul();
		s.div();
	}
}
