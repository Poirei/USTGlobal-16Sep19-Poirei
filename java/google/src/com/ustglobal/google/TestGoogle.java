package com.ustglobal.google;

public class TestGoogle {
	public static void main(String[] args) {
		Google g = new GMail();
		Google gd = new GDrive();
		
		Browser b = new Browser();
		
		b.open(g);
		b.open(gd);
	}
}
