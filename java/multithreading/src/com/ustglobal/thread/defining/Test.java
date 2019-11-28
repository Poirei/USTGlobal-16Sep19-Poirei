package com.ustglobal.thread.defining;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Main started.");
		
		MyThread t1 = new MyThread();
		SecondThread t2 = new SecondThread();
		
		t2.start();
		t1.start();
		
//		t1.start(); //IllegalThreadStateException
		
		/*
		 * Don't call run method, it behaves like normal program. All code will be
		 * executed inside main thread only.
		 * 
		 * t1.run();
		 */
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread.");
		}
		
		System.out.println("Main ended.");
		
	}
	
}
