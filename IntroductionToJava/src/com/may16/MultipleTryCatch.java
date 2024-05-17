package com.may16;

public class MultipleTryCatch {

	public static void main(String[] args) {
		try {
			System.out.println("Multiple try-catch");
			try {
				String name="Capgemini";
				
				System.out.println(name.length());
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			try {
				int a[]=new int[5];
				a[6]=500;
				System.out.println(a[6]);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			try {
				int c=10/0;
				System.out.println(c);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
		catch(Exception e){
			
			System.out.println(e);
		}
		
		

	}

}