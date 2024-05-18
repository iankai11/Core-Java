package com.may18;

public class ThreaDemo2 implements Runnable {

	@Override
	public void run() {
		System.out.println("This is Runnable run method ");
		
	}
	public static void main(String[] args) 
	{
		ThreaDemo2 t1=new ThreaDemo2();
		Thread t=new Thread(t1);
		t.start();

	}


	
	

}
 