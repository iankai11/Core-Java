package com.may17;

import java.util.Scanner;

public class ThrowAndThrowsDemo {

	static Scanner sc=new Scanner(System.in);
	public static void checkNumber() throws PositiveException, NegativeException {
	System.out.println("Enter number:");
	int no=sc.nextInt();
	
	if(no>0) {
		throw new PositiveException("Number is greter than 0");
	}
	else if(no<0) {
		throw new NegativeException("Number is negative");
	}
	else {
		System.out.println("number is zero");
	}
	}
	public static void main(String[] args) {
		try {
			checkNumber();
		} catch (PositiveException | NegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}