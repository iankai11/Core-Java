package com.may18;

public class ThreadDemo3  extends Thread{

	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo3 t1=new ThreadDemo3();
		ThreadDemo3 t2=new ThreadDemo3();
		ThreadDemo3 t3=new ThreadDemo3();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();

	}

}