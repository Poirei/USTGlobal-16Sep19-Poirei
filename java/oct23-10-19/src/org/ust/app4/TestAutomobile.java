package org.ust.app4;

public class TestAutomobile {
	public static void main(String[] args) {
		IAutomobileWithABS ia;
		ia = new BMW();
		ia.gear();
		ia.gps();
		ia.abs();
		System.out.println(ia.left);
		System.out.println(ia.right);
	}
}
