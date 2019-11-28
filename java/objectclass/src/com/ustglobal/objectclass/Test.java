package com.ustglobal.objectclass;

public class Test {

	public static void main(String[] args) {
		
		USBPort up = new USBPort();
		PenDrive p = new PenDrive();
		Mouse m = new Mouse();
		
		up.connect(m);
		up.connect(p);
		
	}

}
