package com.tectoro.map;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LisIte 
{

	public static void main(String[] args) 
	{
		List y=new ArrayList();
		y.add("sujatha");
		y.add("prashanth");
		y.add("naresh");
		y.add("naveen");
		System.out.println(y);
		
		ListIterator i=y.listIterator();
		
		while (i.hasNext()) 
		{
			String t1 = (String) i.next();
			if(t1.equals("naveen"))
			{
				i.remove();
			}
			else if(t1.equals("naresh"))
			{
				i.add("sunnny");
				System.out.println(i);
			}
			else if(t1.equals("sujatha"))
			{
				i.set("venkat");
			}
			System.out.println(i);	
		}
		
	}

}
