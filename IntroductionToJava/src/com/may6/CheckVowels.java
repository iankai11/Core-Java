package com.may6;

import java.util.Scanner;

public class CheckVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your vowels");
		String input = sc.nextLine();
		input = input.toLowerCase();
        
		int vowelcount = 0;
		System.out.println("your vowels are");
		for(int i=0;i<=input.length();i++) 
		{
			char ch = input.charAt(i);
			
			switch(ch)
			{
			  case 'a':
			  case 'e':
			  case 'i':
			  case 'o':
			  case 'u':	  
				System.out.println(ch);
				vowelcount++;
				default:
					System.out.println();
			}
			
		}
		}System.out.println("number of vowels are : "+vowelcount);
		
	}

}
}
