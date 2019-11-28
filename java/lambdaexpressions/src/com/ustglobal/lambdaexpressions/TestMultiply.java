package com.ustglobal.lambdaexpressions;

public class TestMultiply {

	public static void main(String[] args) {
		
		IMultiply im = (a, b) -> a * b;
		System.out.println(im.multiply(20, 30));
		
		
	}
	
}
