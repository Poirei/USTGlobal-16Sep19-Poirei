package com.ustglobal.studentapp.qspiders;

import com.ustglobal.studentapp.jspiders.*;

public class TestQ {

	public static void main(String[] args) {
		
		QTP q = new QTP();
		q.teachQTP();
		Selenium s = new Selenium();
		s.teachSelenium();
		
		Angular a = new Angular();
		a.teachAngular();
		
		React r = new React();
		r.teachReact();
	}

}
