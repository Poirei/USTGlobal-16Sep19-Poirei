package org.ust.app2;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.makeNoise();
		Cat c = new Cat();
		c.makeNoise();
		Lion l = new Lion();
		l.makeNoise();
		Snake s = new Snake();
		s.makeNoise();
	}

}
