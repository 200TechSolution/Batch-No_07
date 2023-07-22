package com.tech.arralist;

import java.util.ArrayList;
import java.util.List;

public class College {
	
	public List m1()
	{
		
		
		Student s1=new Student();
		        s1.setSid(101);
		        s1.setsName("Devansh Shinde");
		        s1.setAddrs("Nashik");
		        
		        
		Student s2=new Student();
		        s2.setSid(102);
		        s2.setsName("SHrirang Uffade");
		        s2.setAddrs("Dindori");
		        
		Student s3=new Student();
		      s3.setSid(103);
		      s3.setsName("Amol Salunke");
		      s3.setAddrs("Vaijapur");
		      
		      List list=new ArrayList();
		           list.add(s1);
		           list.add(s2);
		           list.add(s3);
		           
				return list;

		    		  
		      
	}

}
