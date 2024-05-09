package com.may9;

import java.util.Scanner;

class User{
	String uname;
	String email;
	User(String uname,String email){
		this.uname=uname;
		this.email=email;
	}
	void show() {
		System.out.println(uname+" "+email);
	}
	User(){};
}
public class Constructor2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User u2 =new User();
		System.out.println("Enter student uname:");
		u2.uname = sc.nextLine();
		System.out.println("Enter student email:");
		u2.email = sc.nextLine();
		
	u2.show();

	}

}