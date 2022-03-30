package com.tectoro.map;
//Pg to get the list of all keys in Map
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Larkey 
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
		
		 Set<String> key=hm.keySet();
		System.out.println(key);
		
		
	}
}