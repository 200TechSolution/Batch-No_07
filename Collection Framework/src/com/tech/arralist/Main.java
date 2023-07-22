package com.tech.arralist;

import java.util.Iterator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		College c=new College();
		
		 List list=c.m1();
		 
		 System.out.println(list);
		 
		  Iterator itr= list.iterator();
		  
		  while(itr.hasNext())
		  {
			    Student stu=(Student) itr.next();
			    
			    System.out.println(stu.getSid());
			    System.out.println(stu.getsName());
			    System.out.println(stu.getAddrs());
		  }
		
	}

}
