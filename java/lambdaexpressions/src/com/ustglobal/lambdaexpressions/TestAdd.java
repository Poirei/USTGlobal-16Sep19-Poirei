package com.ustglobal.lambdaexpressions;

public class TestAdd implements IAdd {
	
	public static void main(String[] args) {
		TestAdd t1 = new TestAdd();
		int sum = t1.add(12, 30);
		System.out.println("Sum is " + sum);
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	
}
