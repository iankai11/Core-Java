package com.apr30;

import java.util.Scanner;

public class IfElseIfStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("number de re baba");
		
		int a = sc.nextInt();
		
		if(a%2==0 && a!=0){
			
			System.out.println("it is even");
		}else if(a==0) {
			
			System.out.println("it is 0");
		}else { 
			
			System.out.println("it is odd");
			
		}
		}

	
}
