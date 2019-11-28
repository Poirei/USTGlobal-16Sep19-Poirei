package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen>{
	
	double price;
	String brand;
	
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "The cost of " + brand + " is \u20B9" + price;
	}

	@Override
	public int compareTo(Pen p) {
		return ((Double)this.price).compareTo((Double)p.price);
	}
	
}
