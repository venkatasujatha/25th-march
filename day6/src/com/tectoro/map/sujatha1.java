package com.tectoro.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class sujatha1 
{

	public static void main(String[] args) 
	{
		HashMap<String, Integer> r=new HashMap<String, Integer>();
		r.put("sujatha", 10);
		r.put("sunny", 20);
		r.put("balu", 30);
		r.put("sasi", 40);
		r.put("sana", 60);
		System.out.println(r);
		Set<Entry<String, Integer>> rr=r.entrySet();
		
		
		Iterator<Entry<String, Integer>> er=rr.iterator();
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sn.nextInt();
		
		while (er.hasNext()) 
		{
			if(a==er.next().getValue())
			{
			er.remove();
			}
		}
		System.out.println(r);
	}
}
