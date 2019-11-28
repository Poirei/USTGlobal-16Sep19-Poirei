package org.ust.Animal;

public class Dog extends Animal{
	@Override
	void eat() {
		System.out.println("A dog eats biscuit.");
	}

	void bark() {
		System.out.println("A dog barks.");
	}
}
