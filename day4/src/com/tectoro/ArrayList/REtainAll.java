package com.tectoro.ArrayList;

import java.util.ArrayList;

public class REtainAll 
{

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		System.out.println(a);
		
		ArrayList y=new ArrayList();
		y.add(20);
		y.add(10);
		y.add(40);
		y.add(80);
		y.add(60);
		System.out.println(y);
		
		a.retainAll(y);
		System.out.println(a);

	}

}
