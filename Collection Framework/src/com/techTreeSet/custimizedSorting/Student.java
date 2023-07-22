package com.techTreeSet.custimizedSorting;

public class Student {
	
	int sid;
	String sName;
	public Student(int sid, String sName) {
		
		this.sid = sid;
		this.sName = sName;
	}
	
	@Override
	public String toString()
	{
		return "Sid :"+sid +" , Sname :"+sName;
		
	}
	
	
	

}
