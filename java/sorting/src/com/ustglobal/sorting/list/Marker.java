package com.ustglobal.sorting.list;

public class Marker implements Comparable<Marker>{
	int price;
	String color;
	
	public Marker(int price, String color) {
		super();
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Marker [price=" + price + ", color=" + color + "]";
	}

	@Override
	public int compareTo(Marker o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
