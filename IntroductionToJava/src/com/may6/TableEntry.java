package com.may6;

import java.util.Scanner;

public class TableEntry {
	
	public static void disp(long name, int id) {
		
		System.out.println("student name is : "+name+" and id is "+id);
	}

	public static void main(String[] args) 
	{
		TableEntry t1 = new TableEntry();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter stusent id : ");
		long sid = sc.nextLong();
		System.out.println("enter stusent name : ");
		String sname = sc.nextLine();
		System.out.println("press 1: if u want to continue the entry");
		System.out.println("press 2: if u want to quit the entry");
		int a = sc.nextInt();
		
		if(a==1) 
		{
			System.out.println(t1.sname);
			System.out.println(t1.sid);
		}else {
			System.out.println("exit!");
		}
		
		
	}

}
