package com.ustglobal.abstraction;

public class TestATM {
	public static void main(String[] args) {
		ATM atm1 = new HDFC();
		HDFC hdfc = (HDFC)atm1;
		ATM atm2 = new ICICI();
		ATM atm3 = new SBI();
		Machine m = new Machine();
		m.slot(atm1);
		System.out.println("====================*");
		m.slot(atm2);
		System.out.println("====================*");
		m.slot(atm3);
	}
}
