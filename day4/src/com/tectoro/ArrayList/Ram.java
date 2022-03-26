package com.tectoro.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Ram 
{

	public static void main(String[] args) 
	{
		ArrayList<String> e=new ArrayList<String>();
		
		e.add("Sujatha");
		e.add("mani");
		e.add("raghu");
		e.add(null);
		e.add("Sujatha");
		
		Iterator i=e.iterator();
		i.forEachRemaining(System.out::println);
		
		System.out.println(e.size());
		
		e.add(1,"Suju");
		System.out.println(e);
		
		e.set(2,"cat");
		
		System.out.println(e);
		
		Object[] a=e.toArray();
		
		e.forEach(System.out::println);

	}

}
