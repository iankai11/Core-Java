package com.may3;

import java.util.Scanner;

public class JaggedArrInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row");
		int r = sc.nextInt();
		System.out.println("Enter column");
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		System.out.println("enter the elements of the array");
		
		//input
		for(int i=0;i<r;i++) 
		{
			for(int j=0;j<c;j++) 
			{
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		
		for(int i=0;i<r;i++) 
		{
			for(int j=0;j<c;j++) 
			{
				System.out.print(arr[i][j]+" "); 
			}
			System.out.println();
		}
		
		
	}

}
