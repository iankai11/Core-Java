package com.may4;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int a[] = {12, 34, 56, 78, 89, 445, 75, 34, 667};
		Arrays.sort(a);
		
		System.out.println("max is :"+a[a.length-1]+" and min is :"+a[0]);

	}

}
