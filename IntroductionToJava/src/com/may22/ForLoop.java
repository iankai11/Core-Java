package com.may22;


import java.util.ArrayList;

public class ForLoop {

	public static void main(String[] args) {
		
		//List<Integer>l1=new ArrayList<Integer>();
		ArrayList<Integer>l1=new ArrayList<Integer>();
		//add() method is used to append exact one element at time
		l1.add(200);
		l1.add(20);
		l1.add(5);
		l1.add(200);
		l1.add(4);
	
		System.out.println(l1);
		ArrayList<Integer>l2=new ArrayList<Integer>();
		l2.add(1000);
		l2.add(11100);
		//addAll()method is used to append more than one element at time
		l1.addAll(l2);
		System.out.println(l1);
		//indexof() method is used to check index number for perticular value
		System.out.println(l1.indexOf(1000));
		
		
		//add(index no,value)
		//this method is used to store value on perticular index no
		l1.add(2,12);
		System.out.println(l1);
		System.out.println("using for loop");
		
		if(l1.isEmpty())
			{
				System.out.println("is empty");
			}else {
				
			for(int i=0; i<l1.size();i++)
		{
			System.out.println(l1.get(i));
			
		}
			
			}
	
		//get() method is used to check value from perticular index
		System.out.println(l1.get(2));
		
		l1.set(2, 122);
		System.out.println(l1);
		
		
	}

}