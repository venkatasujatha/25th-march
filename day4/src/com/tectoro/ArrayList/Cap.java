package com.tectoro.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
public class Cap 
{
	
	public static void main(String[] args) 
	{
		ArrayList<String> e=new ArrayList<String>(5);
		
		e.add("Sujatha");
		e.add("mani");
		e.add("raghu");
		e.add(null);
		e.add("Sujatha");
		e.add(2,"sony");
		
		Iterator i=e.iterator();
		
		i.forEachRemaining(System.out::println);
}
}