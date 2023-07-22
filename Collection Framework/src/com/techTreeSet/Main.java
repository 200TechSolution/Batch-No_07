package com.techTreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<Employee> t = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Choise");
		System.out.println("1.IdSort \n 2.NameSort \n 3.SalarySort");
		int x = sc.nextInt();

		switch (x) {

		case 1:
			t = new TreeSet(new IdSort());

			break;

		case 2:
			t = new TreeSet<Employee>(new NameSort());

			break;

		default:
			System.out.println("Please Enter Valied Input");
			break;
		}

		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setEname("Ram");
		e1.setSalary(15000.00);

		Employee e2 = new Employee();
		e2.setEid(102);
		e2.setEname("Akash");
		e2.setSalary(12000.00);

		Employee e3 = new Employee();
		e3.setEid(103);
		e3.setEname("Yogesh");
		e3.setSalary(20000.00);

		Employee e4 = new Employee();
		e4.setEid(104);
		e4.setEname("Mayur");
		e4.setSalary(22000.00);

		Employee e5 = new Employee();
		e5.setEid(105);
		e5.setEname("Ishwar");
		e5.setSalary(300000.00);

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);

		for (Employee emp : t) {
			System.out.println(emp.getEid());
			System.out.println(emp.getEname());
			System.out.println(emp.getSalary());
			System.out.println("********************");
		}
	}

}
