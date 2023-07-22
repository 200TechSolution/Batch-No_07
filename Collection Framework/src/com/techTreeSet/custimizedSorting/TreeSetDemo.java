package com.techTreeSet.custimizedSorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		ArrayList<Student> t = new ArrayList();
		t.add(new Student(101,"Mayur"));
		t.add(new Student(104,"Yogesh"));
		t.add(new Student(102,"Ishwar"));
		t.add(new Student(107,"Akash"));
		
		
		
		

		System.out.println(t);
		
		Collections.sort(t,(s1,s2)->(s1.sid<s2.sid)?-1:(s1.sid>s2.sid)?1:0);
		System.out.println(t);

//		
	}

}
