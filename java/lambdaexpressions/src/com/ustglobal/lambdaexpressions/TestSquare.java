package com.ustglobal.lambdaexpressions;

public class TestSquare {

	public static void main(String[] args) {
		ISquare is = (d) -> d * d;
		System.out.println(is.square(23.9));
	}
	
}
