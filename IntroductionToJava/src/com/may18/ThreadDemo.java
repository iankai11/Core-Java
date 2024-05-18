package com.may18;

public class ThreadDemo extends Thread{

	public void run() {
		System.out.println("This is run method");
	}
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
		ThreadDemo t3=new ThreadDemo();
		t1.start();
		try {
			t1.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t2.getName());
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.getName());
		t3.start();
	}

}