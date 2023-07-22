package com.tech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;

public class ArraListDemo {

	public static void main(String[] args) {

		
		Vector v=new Vector(4,100);
		     
		for(int i=1;i<=15;i++)
		{
			  v.addElement(i);
		}
		    
		     
		     
		System.out.println(v);
		
		System.out.println(v.size());
		
		System.out.println(v.capacity());
		
	}		
}
