package com.tech.sort;

import java.util.Scanner;
import java.util.TreeSet;



public class Test {
	
	public static void main(String[] args) {
		
		TreeSet<Employee>t=null;
		
		Scanner sc = new Scanner(System.in);
     while(true)
     {
		System.out.println("Enter your Choise");
		System.out.println("1.IdSort \n 2.Salary \n 3.NameSort");
		int x = sc.nextInt();
		
		switch(x)
		{
		case 1:
			   t=new TreeSet<Employee>(new ByIdSort());
			   
			   break;
			   
		case 2:
			  t=new TreeSet<Employee>(new BySalarySort());
			  
			  break;
		
		default :
			System.out.println("Please Enter Valied Input");
			
		}
     
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.seteName("Ram");
		e1.setSalary(30000);

		Employee e2 = new Employee();
		e2.setEid(102);
		e2.seteName("Akash");
		e2.setSalary(20000);

		Employee e3 = new Employee();
		e3.setEid(103);
		e3.seteName("Devang");
		e3.setSalary(15000);

		

		t.add(e1);
		t.add(e2);
		t.add(e3);
		

		for (Employee emp : t) {
			System.out.println(emp.getEid());
			System.out.println(emp.geteName());
			System.out.println(emp.getSalary());
			System.out.println("********************");
		}
		
		
	}
	}
}
