package com.may3;

import java.util.Scanner;

public class Arr_User_Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n =sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the values in the array :");
		for(int i=0;i<n;i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Element are: ");
		for(int i=0;i<n;i++) 
		{
			System.out.println(arr[i]);
			
		}
	}

}
