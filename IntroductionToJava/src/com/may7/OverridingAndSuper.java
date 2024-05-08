package com.may7;
class Animal{
	void eat() {
		System.out.println("Animal eat ");
	}
}
class Dog extends Animal{
	void eat() {
		super.eat();
		System.out.println("Dog eat ");
	}
}
class Cat extends Dog{
void eat() {
	super.eat();
	System.out.println("Cat eat ");	
	}
}
public class OverridingAndSuper {

	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.eat();
		

	}

}