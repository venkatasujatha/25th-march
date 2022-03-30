package com.tectoro.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Lasc1 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> gh=new HashMap<Integer, String>();
		gh.put(10, "sujatha");
		gh.put(20, "prashanth");
		gh.put(40, "naresh");
		gh.put(60, "salman");
		int max=0;
		Set<Entry<Integer,String>> y=gh.entrySet();
		Set<Integer> w1 = gh.keySet();
		System.out.println(w1);
		
		for(Integer i:w1)
		{
			if(max<i)
			{
				max=i;
				
			}
		}			System.out.println(max);


	}

}
