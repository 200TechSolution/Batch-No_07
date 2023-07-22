package com.techTreeSet;

import java.util.Comparator;

public class Employee implements Comparator {
	
	int Eid;
	String Ename;
	double Salary;
	
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	
	
	@Override
	public int compare(Object obj1, Object obj2) {
		
      Employee e1=(Employee)obj1;
      Employee e2=(Employee)obj2;
		
		return (int) e1.getSalary()-(int)e2.getSalary();
	}

}
