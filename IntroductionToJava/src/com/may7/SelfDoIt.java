package com.may7;
class Parent
{
	public void show1()
	{
		System.out.println("this is parent class!!!");
	}
	
}

class Child extends Parent
{
	public void show2()
	{
		System.out.println("this is Child class!!!");
	}
}
public class SelfDoIt {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		p.show1();
		c.show2();
		c.show1();
		
	}

}
