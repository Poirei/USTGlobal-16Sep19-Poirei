package com.ustglobal.thread.pausing;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Main started.");
		
		Counter c = new Counter();
		
		Runnable r1 = () -> {
			c.increment();
			c.showValue();
		};
		
		Runnable r2 = () -> {
			c.decrement();
			c.showValue();
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.setPriority(10);
		t2.setPriority(9);
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println("Main ended.");
	}
	
}
