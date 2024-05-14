package com.may13;
interface info{
	public void show(String name,String address);
}
interface info1{
	public void disp(Long mobileno,String emailid);
}

interface info2 extends info,info1{
	
}

class Company implements info2{

	@Override
	public void show(String name, String address) {
		System.out.println(name+" "+address);
		
	}

	@Override
	public void disp(Long mobileno, String emailid) {
	System.out.println(mobileno+ " "+emailid);
		
	}
	
}

class Employee implements info2{

	@Override
	public void show(String name, String address) {
	System.out.println(name+" "+address);
		
	}

	@Override
	public void disp(Long mobileno, String emailid) {
		System.out.println(mobileno+ " "+emailid);
		
	}
	
}


public class Interface3 {

	public static void main(String[] args) {
		Company c1=new Company();
		Employee e1=new Employee();
		
		c1.show("jhon", "pune");
		c1.disp(8956236589L, "jhon@gmail.com");
		e1.show("capgemini", "Airoli");
		e1.disp(7852639632L, "cg@gmail.com");
	}

}