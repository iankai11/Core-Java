package com.may2;

import java.util.Scanner;

public class DecrementPyramid {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the no. of lines u require :");
		int n= sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				 
				 System.out.print("*");
				
			
			}
			
			System.out.println();
		}
		
		
		
	}

}