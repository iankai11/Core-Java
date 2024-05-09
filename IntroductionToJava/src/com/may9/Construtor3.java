package com.may9;
import java.util.Scanner;

class Product{
	int pid;
	String pname;
	int prise;
	
	Product(int id,String name,int pr){
		this.pid=id;
		this.pname=name;
		this.prise=pr;
	}
	Product(){};
	void disp() {
		System.out.println("*Product Details*");
		System.out.println("Product Id:"+pid+"\nProduct Name:"+pname+"\nProduct prise:"+prise);
	}
}
public class Construtor3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Product p1=new Product();
		
		System.out.println("Enter Product Id:");
		p1.pid=sc.nextInt();
		System.out.println("Enter Product Name:");
		
		p1.pname=sc.next();
		
		System.out.println("Enter Product Prise:");
		p1.prise=sc.nextInt();
		
		Product p2=new Product(p1.pid,p1.pname,p1.prise);
	     p2.disp();
	}

}