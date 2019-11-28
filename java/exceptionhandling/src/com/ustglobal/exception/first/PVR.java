package com.ustglobal.exception.first;

public class PVR {
	void book() {
		System.out.println("Booking started.");
		try {
			System.out.println(10/0);
			System.out.println("Booking logic.");
			System.out.println("Booking successful.");
		} catch (ArithmeticException ae) {
			System.out.println("Booking failed.");
			throw ae;
		}
		
	}
}
