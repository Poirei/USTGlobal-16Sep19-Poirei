package com.ustglobal.features;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i % 2 == 0;
		
		if (p.test(32))
			System.out.println("Even.");
		else
			System.out.println("Odd.");
	}
}
