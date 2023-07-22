package com.tech.solution;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Address adrs = new Address();
		adrs.setAreaName("phase 1");
		adrs.setCityName("Hinjwadi");
		adrs.setPinCode(411058);

		Address a1 = new Address();
		a1.setCityName("Vaijapur");
		a1.setAreaName("Shivaji Chouk");
		a1.setPinCode(423701);

		Student deva = new Student();
		deva.setSid(101);
		deva.setSname("Devang Shinde");
		deva.setEmail("deva123@gmail.com");
		deva.setAddrs(adrs);

		Student rahul = new Student();
		rahul.setSid(102);
		rahul.setEmail("rahulmohin@gmail.com");
		rahul.setSname("Rahul Mohin");
		rahul.setAddrs(adrs);

		List<Student>l=new ArrayList<Student>();
		             l.add(deva);
		             l.add(rahul);
		             
		             System.out.println(l);
		
//		System.out.println(rahul.getSid());
//		System.out.println(rahul.getEmail());
//		System.out.println(rahul.getSname());
//		System.out.println(rahul.getAddrs().getCityName());
//		System.out.println(rahul.getAddrs().getAreaName());
//		System.out.println(rahul.getAddrs().getPinCode());

	}

}
