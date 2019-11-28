package org.ust.app4;

public class BMW implements IAutomobileWithABS{

	@Override
	public int gear() {
		System.out.println("gear() method of BMW.");
		return 0;
	}

	@Override
	public int gps() {
		System.out.println("gps() method of BMW.");
		return 0;
	}

	@Override
	public void abs() {
		System.out.println("abs() of BMW.");
	}
	
}
