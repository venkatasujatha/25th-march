package com.tectoro.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class maxKey 
{

	public static void main(String[] args) 
	{
		TreeMap<String, String> hm1=new TreeMap<String, String>();
		hm1.put("20","sujatha");
		hm1.put("30","laxmi");
		hm1.put("40","srinu");
		hm1.put("98","chinni");
		hm1.put("23","lalli");
		hm1.put("12","ramu");
		hm1.put("10","ganesh");
		System.out.println(hm1);
		Set<String> t1=hm1.keySet();
		for(String r:t1)
		{
			System.out.println(r);
		}
		System.out.println();
		Set<String> kew=hm1.descendingKeySet();
		for(String t:kew)
		{
			System.out.println(t);
		}
		Set<Entry<String,String>> e1=hm1.entrySet();
		System.out.println(e1);
		
		Map<String,String> e=hm1.descendingMap();
		System.out.println(e);
	}
	

}
