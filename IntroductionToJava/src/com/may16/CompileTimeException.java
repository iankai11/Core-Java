package com.may16;

public class CompileTimeException {

		public static void main(String[] args) {

			try {

			int c=10/0;
			System.out.println(c);
			}catch(Exception e) {
				
				System.out.println(e);
				System.out.println(e.getMessage());
				e.printStackTrace();
				
			}
			System.out.println("Hello");
			
		}

	}