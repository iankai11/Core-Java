package com.may2;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how long u want ur pyramid to be");
		int n =sc.nextInt();
		int a = 1; 
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k<n-a;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=a;j++) 
			{
				System.out.print(a);
			}
			a++;
			System.out.println();
		}

	}

}
