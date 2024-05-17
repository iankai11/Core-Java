package com.may16;

public class OneTryMultipleCatch {

	public static void main(String[] args) {
		try {
		String name="Capgemini";
		
		System.out.println(name.length());
		int a[]=new int[5];
		a[6]=500;
		System.out.println(a[6]);
		int c=10/0;
		System.out.println(c);

	}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			}
		catch(ArithmeticException e) {
			e.printStackTrace();
			}
		catch(NullPointerException e) {
			e.printStackTrace();
			}
		int a=10,b=20;
	System.out.println(a+b);
		}
		


}