package com.may22;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class IteratorBasic {

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
		//indexof() method is used to check index number for perticalular value
		System.out.println(l1.indexOf(1000));
		
		
		//add(index no,value)
		//this method is used to store value on perticular index no
		l1.add(2,12);
		System.out.println(l1);
		
		//get() method is used to check value from perticular index
		System.out.println(l1.get(2));
		
		l1.set(2, 122);
		System.out.println(l1);
		System.out.println("using for loop");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("Checking data available or not");
		if(l1.isEmpty()) {
			System.out.println("Data not avaialbel");
		}
		else {
			for(int i=0;i<l1.size();i++) {
				System.out.println(l1.get(i));
			}
		}
		
		System.out.println("Enhanced for loop");
		for(Integer k:l1) {
			System.out.println(k);
		}
		System.out.println("while loop");
		
		int j=0;
		while(j<l1.size()) {
			System.out.println(l1.get(j));
			j++;
		}
		
		System.out.println("Using Iterator");
		//Iterator<data type>variablename=list_name.iterator();
		Iterator<Integer>i1=l1.iterator();
		
		while(i1.hasNext()) {
			//next() method is inbuilt method used to Returns the next element in the iteration.
			System.out.println(i1.next());
		}
	}

}