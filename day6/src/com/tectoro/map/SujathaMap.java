package com.tectoro.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SujathaMap 
{

	public static void main(String[] args) 
	{
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("First Name", "sujatha");
		hm.put("Last Name", "venkata");
		hm.put("Last Name", "valluru");
		hm.put("phonenum", "9876034874");
		hm.put("Age", "23");
		hm.put("DOB", "12-06-2000");
		hm.put("Gender", "Female");
		System.out.println(hm);
		
		//return the value by get()
		
		System.out.println(hm.get("Age"));
		System.out.println(hm.get("DOB"));
		
		//putAll
		HashMap<String, String> sm=new HashMap<String, String>();
		sm.put("email", "venkata@gmail.com");
		sm.put("password", "##8080$$");
		sm.put("pincode", "560228");
		
		
		hm.putAll(sm);
		System.out.println(hm);
		
		//remove
		
		hm.remove("Age");
		System.out.println(hm);
		
		//contains Key
		
		if(hm.containsKey("DOB"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("NO");
		}
		System.out.println(hm);
		
		//contains value
		
		if(hm.containsValue("valluru"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		//isEmpty
		if(hm.isEmpty())
		{
			System.out.println("map is empty");
		}
		
		else
		{
			System.out.println("map is not empty");
		}
		
		//size
		
		System.out.println(hm.size());
		
		//clear
		
		sm.clear();
		System.out.println(sm);
		
		//Entry(I)
		
		Set<Map.Entry<String,String>> as=hm.entrySet();
		
		//foreach
		
		for(Map.Entry<String,String> e: as)
		{
			System.out.println(e);
		}
	}

}
