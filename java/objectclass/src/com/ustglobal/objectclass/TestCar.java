package com.ustglobal.objectclass;

public class TestCar {
	public static void main(String[] args) {
		Car c = new Car(450000, "Lamborghini", "Black");
		Car c1 = new Car(890000, "Maruti", "White");
		Car c2 = new Car(1500000, "Mercedes", "Blue");
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
	}
}
