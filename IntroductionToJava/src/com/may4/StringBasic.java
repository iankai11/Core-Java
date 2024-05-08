package com.may4;

public class StringBasic {

	public static void main(String[] args) {
		
		String name="Javascript";
		
		System.out.println(name);
		
		String x = new String("SpringBoot");
		System.out.println(x);
		//x.append("jsp");
		System.out.println(x);
		String fname = "jhon";
		String lname = "Smith";
		System.out.println(fname+lname);
		System.out.println(fname.length());
		System.out.println(fname.concat(lname));
		
		StringBuilder s = new StringBuilder("jWT");
		System.out.println(s);
		//append is inbuilt method to add an element 
		s.append("Servlet");		
		System.out.println(s);
		s.append("Css");
		System.out.println(s);
		s.replace(1, 4, "rain");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
}
}
