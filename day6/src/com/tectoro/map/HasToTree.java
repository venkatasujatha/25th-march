package com.tectoro.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;


public class HasToTree 
{

	public static void main(String[] args) 
	{
		Map<String,Integer> rw=new HashMap<String,Integer>();
		rw.put("sujatha",1);
		rw.put("bharathi",2);
		rw.put("bharat",3);
		System.out.println(rw);
		
		TreeMap<String,Integer> g=new TreeMap<String, Integer>();
		
		Set<Entry<String, Integer>> t=g.entrySet();
		
		for(Entry<String, Integer> r:rw.entrySet())
		{
			System.out.println(r);
		}
	}

}
