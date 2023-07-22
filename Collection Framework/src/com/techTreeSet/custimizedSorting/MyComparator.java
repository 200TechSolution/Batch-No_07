package com.techTreeSet.custimizedSorting;

import java.util.Comparator;

public class MyComparator  implements Comparator{

	@Override
	public int compare(Object Obj1, Object Obj2) {
		
		       Integer I1=(Integer)Obj1; 
		       Integer I2=(Integer)Obj2;
		       
		       
		         
		         if(I1>I2)
		         {
		        	 return -1;
		         }
		         
		         else if(I1<I2)
		         {
		        	 return 1;
		         }
		         
		         else
		         {
		        	 
		        	return I1.compareTo(I2);
		         }
		    
		      
	}

}
