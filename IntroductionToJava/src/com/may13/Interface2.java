package com.may13;
interface Animal{
	public void eat();
   // public static void animalSound();
}

class  Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("CAt is eating");
		
	}
	
}
class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog is eating");
		
	}
	
}
public class Interface2 {

	public static void main(String[] args) {
		Cat c1=new Cat();
		Dog d1=new Dog();
		c1.eat();
		d1.eat();

	}

}