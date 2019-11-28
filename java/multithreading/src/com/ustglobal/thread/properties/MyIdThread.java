package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("Main started.");
		
		System.out.println("main id : " + Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("MyId thread : " + mi.getId());
		
		System.out.println("priority : " + Thread.currentThread().getPriority());
		
//		Thread.currentThread().setPriority(11);// IllegalArgumentException
		System.out.println("Main ended.");
		
	}
	
}
