package com.ustglobal.google;

public abstract class Google {
	void login() {
		System.out.println(this.getClass().getName()+" login.");
	}
	
	abstract void shareDocuments();
}
