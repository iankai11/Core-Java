package com.apr30;

public class test{
	
	static int balance = 9999;
	
	public void show() {
		
		int a = 10;
	    String msg = "Hi\n How r u?";
		System.out.println(msg);		
		System.out.println(a);
		
	}
	
	public static void msg() {
		String name = "gaurav kadwadkar\n";
		int age= 18;
		System.out.println(name+" "+age);
		
	}
	public static void main(String[] args) {
		test t1 = new test();
		t1.show();
		test.msg();
        t1.show();
        System.out.println(test.balance);
	}

}
