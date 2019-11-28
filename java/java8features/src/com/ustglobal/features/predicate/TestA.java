package com.ustglobal.features.predicate;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		Predicate<Car> p = c -> {
			if (c.cost > 500000)
				return true;
			else
				return false;
		};
		
		Car c = new Car(450000, "Maruti", "Blue");
		
		if (p.test(c))
			System.out.println("Costly");
		else
			System.out.println("Cheap");
	}
}
