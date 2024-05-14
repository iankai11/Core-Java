package com.may13;

interface i1{
	void show() ;
		
	
}
interface i2{
	void show1();
}
interface i3  extends i1,i2{
	void show2();
}
class i4 implements i3{

	@Override
	public void show() {
		System.out.println("This is show method");
		
	}

	@Override
	public void show1() {
		System.out.println("This is show1 method");
	}

	@Override
	public void show2() {
		System.out.println("This is show2 method");
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		i4  i=new i4 ();
		
		i.show();
		i.show1();
		i.show2();
	

	}

}