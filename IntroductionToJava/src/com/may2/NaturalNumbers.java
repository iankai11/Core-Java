package com.may2;

import java.util.Scanner;

public class NaturalNumbers {
	
public static void main(String[] args) {
	   
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the end :");
	int n = sc.nextInt();
	
	
	int i =1 ,sum = 0;
	while(i<=n)
	{
		sum = sum+i;
		i++;
	}System.out.println("Sum is: "+sum);
	
	}

}
