package com.may2;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the no. of lines u require :");
		int n= sc.nextInt();
	
for(int i=1;i<=n;i++) {
	     for(int k=1;k<=n;k++)
			{
				System.out.print("*");
			 while(k==n) {
	 	     System.out.println();
	 	     
			for(int j=5;j<k;j--) 
			{
				System.out.print(" ");
			}
			n--;
			}
	}
}	
}
}