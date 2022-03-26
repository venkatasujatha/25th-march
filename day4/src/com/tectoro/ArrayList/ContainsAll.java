package com.tectoro.ArrayList;

import java.util.ArrayList;

import java.util.Scanner;

public class ContainsAll 
{
	
	public static void main(String[] args) 
	{
		
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(80);
		l.add(50);
		
		ArrayList lo=new ArrayList();
		lo.add(10);
		lo.add(40);
		lo.add(50);
		lo.add(80);
		lo.add(90);
		
		//containsAll()
		System.out.println(l.containsAll(lo));
}
}