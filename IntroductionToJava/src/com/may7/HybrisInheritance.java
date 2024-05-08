package com.may7;
class GrandFather{
	public void gf() {
		System.out.println("This is grandfather class");
	}
}
class Father extends GrandFather{
	public void fshow() {
		System.out.println("This is father class");
	}
}
class Son extends Father{
	void srun() {
		System.out.println("This is son class");
	}
}
class Daughter extends Father{
	void drun() {
		System.out.println("This is daughter class");
	}
}
public class HybrisInheritance {

	public static void main(String[] args) {
		Son s1=new Son();
		Daughter d1=new Daughter();
		
		s1.gf();
		s1.fshow();
		s1.srun();
		d1.drun();
	}

}