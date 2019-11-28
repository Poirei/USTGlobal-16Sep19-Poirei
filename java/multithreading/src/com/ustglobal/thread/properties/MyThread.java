package com.ustglobal.thread.properties;

public class MyThread extends Thread {
	
	public static void main(String[] args) {
		System.out.println("Main started.");
		
		System.out.println(Thread.currentThread().getName());
		
		MyThread t1 = new MyThread();
		String name = t1.getName();
		System.out.println("My thread name : " + name);
		
		t1.setName("Reynolds");
		System.out.println(t1.getName());
		
		System.out.println(10/0);
		
		Thread.currentThread().setName("Guldu");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("Main ended.");
	}
	
}
