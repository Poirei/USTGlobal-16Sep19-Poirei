package com.ustglobal.features.function;

import java.util.function.Function;

public class TestA {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i * i;
		
		System.out.println("The square of 5 is " + f.apply(5));
	}
}
