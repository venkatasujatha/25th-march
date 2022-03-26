package com.tectoro.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class removeAll 
{
	public static void main(String[] args) 
	{
		
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(80);
		l.add(50);
		
		ArrayList u=new ArrayList();
		u.add(100);
		u.add(40);
		u.add(50);
		u.add(80);
		u.add(50);
	
	
		u.removeAll(l);
		System.out.println(u);
		System.out.println(l);
		
}
}
