package com.tectoro.map;

import java.util.Enumeration;
import java.util.Vector;

public class EnumP 
{

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e=v.elements();
		
		while (e.hasMoreElements())
		{
			Integer o1 = (Integer) e.nextElement();
			if(o1%2==0)
			{
				System.out.println(o1);
			}
		}
		System.out.println(v);
	}

}
