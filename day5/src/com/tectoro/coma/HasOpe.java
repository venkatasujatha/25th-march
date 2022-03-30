package com.tectoro.coma;

import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



//Write programs to perform various operations on HashSet
public class HasOpe 
{

	public static void main(String[] args) 
	{
		HashSet<String> e=new HashSet<String>();
		e.add("sujatha");
		e.add("sunny");
		e.add("salman");
		e.add("prashanth");
		e.add("Naresh");
		System.out.println(e);
		HashSet<String> e1=new HashSet<String>();
		e1.add("parvez");
		e1.add("raziya");
		e1.add("naresh");
		e1.add("prashanth");
		e1.add("Naveen");
		e.addAll(e1);
		System.out.println(e);
		
		//adding duplicate elements into hashset e1
		
		e1.add("parvez");
		System.out.println(e1);
		
		//remove element from e
		
		e.remove("salman");
		System.out.println(e);
		
		//Iterator
		
		Iterator<String> h=e1.iterator();
		
		//retainAll
		
		e.retainAll(e1);
		
		System.out.println(e);
		while (h.hasNext()==true) 
		{
			System.out.println(h.next());
			
		}
		
		//size of e
		
		System.out.println(e.size());
	
	if(e.isEmpty())
	{
		System.out.println("empty");
	}
	else
	{
		System.out.println("not empty");
	}

	//clone()
	
	HashSet<String> h1=(HashSet) e.clone();
	System.out.println(h1);

	}	
	
	
	
	
}