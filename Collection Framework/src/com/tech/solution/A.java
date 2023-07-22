package com.tech.solution;

public class A {

	public void m1()
	{
		System.out.println("m1 Start");
		
//	   A a1=new A();
//	      a1.m2();
	      
	      this.m2();
	      System.out.println("m1 End");
	}
	
	public void m2()
	{
		System.out.println("m2 Start");
	}
		
	
	public static void main(String[] args) 
	{
		System.out.println("main Start");
		
		A a=new A();
		  a.m1();
		
		System.out.println("main End");
	}


}
