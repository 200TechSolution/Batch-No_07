package com.demo.treeset;

import java.util.TreeSet;

public class main {

	public static void main(String[] args) {


		TreeSet<String>t=new TreeSet<String>(new MyComparator());
		t.add("A");
		t.add("AB");
		t.add("Ac");
		t.add("ABC");
		t.add("ABCD");
		t.add("EFG");
		t.add("ABEF");
		System.out.println(t);

	}

}
