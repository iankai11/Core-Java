package com.may7;
class Product
{
	   
	   int pid = 101;
	   String pname = "Speakers";
	   String orderdate = "7 may 2024";
	   String receivedate = "10 may 2024";
	   
} 


class order extends Product
{
	  public void disp() {
		  
		  System.out.println(pid+" "+pname+" "+orderdate+" "+receivedate);
	  }  

}
public class InheritanceBasic1 {
	
	public static void main(String[] args) 
	{
		order o1 = new order();
		o1.disp();
    
    	   
    }
}