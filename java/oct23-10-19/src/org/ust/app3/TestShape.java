package org.ust.app3;

public class TestShape {

	public static void main(String[] args) {
		GraphicObject c, r, s;
		c = new Circle();
		r = new Rectangle();
		s = new Square();
		c.move();
		c.shape();
		r.shape();
		s.shape();
		s.move();
	}
}
