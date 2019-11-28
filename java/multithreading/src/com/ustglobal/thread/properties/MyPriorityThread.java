package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread {
	public static void main(String[] args) {
		
		System.out.println("Main started.\n");
		
		Thread.currentThread().setPriority(1);
		int p = Thread.currentThread().getPriority();
		System.out.println("Main thread Priority : " + p);
		
		MyPriorityThread mpt = new MyPriorityThread();
		System.out.println("My thread priority : " + mpt.getPriority() + "\n");
		mpt.setPriority(4);
		System.out.println("My thread priority : " + mpt.getPriority() + "\n");
		
		System.out.println("Main ended.");
	}
}
