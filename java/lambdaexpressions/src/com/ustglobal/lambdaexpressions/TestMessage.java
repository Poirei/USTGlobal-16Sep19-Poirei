package com.ustglobal.lambdaexpressions;

public class TestMessage {
	
	public static void main(String[] args) {
		IMessage im = (str) -> {
			System.out.println(str);
		};
		im.message("hello");
	}
	
}
