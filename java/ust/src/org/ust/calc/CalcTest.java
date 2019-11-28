package org.ust.calc;

public class CalcTest {

	public static void main(String[] args) {
		SciCalculator sc = new SciCalculator();
		sc.add();
		sc.cos();
		sc.mul();
		sc.sin();
		System.out.println(sc.hashCode());
	}

}
