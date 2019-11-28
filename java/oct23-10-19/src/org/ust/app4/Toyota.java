package org.ust.app4;

public class Toyota implements IAutomobile{

	@Override
	public int gear() {
		System.out.println("gear() method of Toyota.");
		return 0;
	}

	@Override
	public int gps() {
		System.out.println("gps() method of Toyota.");
		return 0;
	}
}
