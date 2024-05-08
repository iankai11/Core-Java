package com.may2;

import java.util.Scanner;

public class While_input {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number");
			double i = sc.nextDouble();
			
			while(i<=10)
			{
				System.out.println("I="+i);
				i++;
				
				
			}

		}

	}


