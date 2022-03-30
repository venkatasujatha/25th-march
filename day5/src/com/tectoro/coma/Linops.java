package com.tectoro.coma;
import java.util.Iterator;
//Write programs to perform various operations on LinkedHashSet pgm
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Linops 
{

	public static void main(String[] args) 
	{
		Set<String> w1=new LinkedHashSet<String>();
		w1.add("sujatha");
		w1.add("prashanth");
		w1.add("salman");
		w1.add("sumera");
		w1.add("sandeep");
		w1.add("suji");
		System.out.println(w1);
		
		//remove
		
		w1.remove("suji");
		System.out.println(w1);
		
		Set<String> w2=new LinkedHashSet<String>();		
		//isEmpty
		
		if(w1.isEmpty())
		{
			System.out.println("empty");
		}
		else
		{
			System.out.println("not empty");
		}
		System.out.println(w1);
		System.out.println(w2);
		
		//retainAll
		
			w1.retainAll(w2);
			System.out.println(w1);
		
	
	//size
	
	System.out.println(w1.size());
	
		w2.add("santhosh");
		w2.add("pras");
		w2.add("salma");
		w2.add("sumi");
		w2.add("sudeep");
		w2.add("suji");
		w2.add("sujatha");
		System.out.println(w2);
		
		//addAll
		
		w1.addAll(w2);
		System.out.println(w1);
		
		//foreach
		for (String string1 : w2) 
		{
			System.out.println(string1);
		}
			
		//Iterator
		Iterator<String> e=w1.iterator();
		while (e.hasNext()==true) 
		{
			System.out.println(e.next());
			
		}
		
		//isEmpty
		
		if(w1.isEmpty())
		{
			System.out.println("empty");
		}
		else
		{
			System.out.println("not empty");
		}
		System.out.println(w1);
		System.out.println(w2);
		
		//retainAll
		
			w1.retainAll(w2);
			System.out.println(w1);
		
	
	//size
	
	System.out.println(w1.size());
	
	//clear
	w2.clear();
	
	}
}

