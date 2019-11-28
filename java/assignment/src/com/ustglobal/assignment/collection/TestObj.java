package com.ustglobal.assignment.collection;

public class TestObj {
	public static void main(String[] args) {
		Object[] objArr = {new Byte((byte) -127), new Short((short) 10), new Integer(65536), 9791301081L, 4.5f, 65.65, '\u20B9', true};
		
		System.out.println("+++++++++ Using for loop ++++++++\n");
		System.err.println("Type\tValue");
		for (int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i].getClass().getSimpleName() + "\t" + objArr[i]);
		}
		
		System.out.println("+++++++++ Using for-each loop ++++++++\n");
		System.err.println("Type\tValue");
		for (Object obj : objArr) {
			System.out.println(obj.getClass().getSimpleName() + "\t" + obj);
		}
	}
}
