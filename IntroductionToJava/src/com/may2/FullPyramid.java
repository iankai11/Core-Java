package com.may2;

import java.util.Scanner;

public class FullPyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how long u want ur pyramid to be");
		int n =sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k<n-i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
	}

