package com.may13;
interface BackEnd{
	void dispBackendInfo();
}
interface FrontEnd{
	void dispFrontEndInfo();
}

class Developer implements BackEnd,FrontEnd {

	@Override
	public void dispFrontEndInfo() {
		System.out.println("This is Front end developer");
		
	}

	@Override
	public void dispBackendInfo() {
		System.out.println("This is Back end developer");
		
		
	}
	
	
}
public class Interface4 {

	public static void main(String[] args) {
	Developer d1=new Developer();
	
	d1.dispBackendInfo();
	d1.dispFrontEndInfo();
	}

}