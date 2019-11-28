package com.ustglobal.thread.defining;

public class TestRunnable {
	
	public static void main(String[] args) {
		System.out.println("Main started.");
		
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr);
		
		for (int i=0; i < 5; i++) {
			System.out.println("Main thread.");
		}
		t1.start();
		
		System.out.println("Main ended.");
	}
	
}
