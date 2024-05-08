package com.may7;

class Vehicle{
	public void disp()
	{
		int speed;
		System.out.println("this is vehicle class");
	}
	
	
}

class Maruti extends Vehicle
{
	public void show(int speed){
		
		System.out.println("speedo of maruti is: "+speed);

	}
}

class Bycycle extends Maruti
{
	public void run(int speed)
	{
		System.out.println("speed of bycyle is :"+speed);
	}

}



public class InheritanceBasic2 {

	public static void main(String[] args)
	{
		Bycycle z = new Bycycle();
		z.disp();
		z.show(90);
		z.run(80);
	}

}
