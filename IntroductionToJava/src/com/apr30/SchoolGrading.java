package com.apr30;

import java.util.Scanner;

public class SchoolGrading {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the Student: ");
		String name = sc.next();
		
		System.out.println("Enter the marks for Subject 1 = ");
		int m1 = sc.nextInt();
		
		System.out.println("Enter the marks for Subject 2 = ");
		int m2 = sc.nextInt();
		
		System.out.println("Enter the marks for Subject 3 = ");
		int m3 = sc.nextInt();
		
		int total = m1+m2+m3;
		double avg = total/3;
		
		System.out.println(name+" "+total+" "+avg);
		if(avg>80){
			
			System.out.println(name+"scored = "+total+ "and got" +avg+"\tA Grade");
		}
		else if(avg<=80 && avg>60) {
			
			System.out.println(name+"scored = "+total+ "and got" +avg+"\tB Grade");
		}
		else if(avg<=60 && avg>40) {
			
			System.out.println(name+"scored = "+total+ "and got" +avg+"\tC Grade");
			}
			
	    else if(avg<=40 && avg>35) {
			
			System.out.println(name+"scored = "+total+ "and got" +avg+"\tD Grade");
		}
		else if(avg<=35 && avg>25) {
			
			System.out.println(name+"scored = "+total+ "and got" +avg+"\tE Grade");
	    }
		else{
		
		System.out.println(name+"scored = "+total+ "and got" +avg+"\tFAIL");
	}
			
	}
}
