package com.tech;

public class Temp {
	
	public String toString()
	{
		return  "Temp";
	}

	
	@Override
	public void finalize()
	{
		System.out.println("Finalized() Method get Called");
	}
}
