package com.tech.sort;

import java.util.Comparator;

public class ByIdSort implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
	
		return (int)(e1.getEid()-e2.getEid());
	}

}
