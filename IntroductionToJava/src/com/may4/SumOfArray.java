package com.may4;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
    
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int l = sc.nextInt();
		int a[] =new int[l];
		int sum = 0;
		System.out.println("enter the numbers");
		
		for(int i=0;i<l;i++) 
		{
			a[i] = sc.nextInt();
		}

		System.out.print("our array is : ");
		for(int j=0;j<l;j++) 
		{
			System.out.print(a[j]+" ");
		}
	
	
		for(int k=0;k<l;k++) 
		{
			sum = sum + a[k];
		}
		System.out.print("Sum of the Array is : "+sum);
		System.out.println();
	}
    
}
