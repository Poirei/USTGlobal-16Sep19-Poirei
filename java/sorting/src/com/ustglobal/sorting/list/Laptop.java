package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>{
		double price;
		String brand;
		int ram;
		
		public Laptop(double price, String brand, int ram) {
			super();
			this.price = price;
			this.brand = brand;
			this.ram = ram;
		}

		@Override
		public String toString() {
			return "The cost of " + brand + " laptop with " + ram + "GB of RAM is \u20B9" + price;
		}

		@Override
		public int compareTo(Laptop l) {
			
			return ((Double)this.price).compareTo((Double)l.price);
		}
		
		
}
