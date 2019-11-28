package com.ustglobal.objectclass;

public class USBPort {
	
	public void connect(Object obj) {
		
		if(obj instanceof Mouse) {
			Mouse m = (Mouse) obj;
			System.out.println("Mouse connected.");
			m.click();
			m.scroll();
		} else if(obj instanceof PenDrive) {
			PenDrive p = (PenDrive) obj;
			System.out.println("Pendrive connected.");
			p.read();
			p.write();
		} else
			System.out.println("Invalid object!");
		
	}
}
