package com.may3;

public class LargestInJaggedArray {

	public static void main(String[] args) {
	    
		int max = 0;
		int arr[][] = new int[2][2];
		
		
		
		int count = 0;
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<2;j++) 
			{
			 arr[i][j]=count++;
			
			
			}
		} 
		  for(int i=0;i<2;i++) 
		{
			for(int j=0;j<2;j++) 
			{
			 System.out.print(arr[i][j]+" ");
			
			
			}System.out.println();
		}
         for(int i=0;i<2;i++) {
        	 for(int j=0;j<2;j++) {
		  if(arr[i][j]<arr[i+1][j+1]) {
	
             max=arr[i+1][j+1];
         
         }else
         {
        	 max = arr[i][j];
         }
		  
         }
         }
          System.out.println();
          System.out.print(max);
         }

}