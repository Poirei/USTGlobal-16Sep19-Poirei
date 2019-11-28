package com.ustglobal.lambdaexpressions;

public class TestFact {
	public static void main(String[] args) {
		IFact iF = (x) -> {
			
			int fact = 1;
			for(int i = 2; i <= x; i++) {
				fact *= i;
			}return fact;
		};
		System.out.println(iF.fact(5));
	}
}
