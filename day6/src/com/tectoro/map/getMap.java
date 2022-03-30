package com.tectoro.map;
//Pgm to get the value associated with a particular key and modify its value
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class getMap 
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
		
		//Modify value 
		
		hm.replace("Age","23","26");
		System.out.println(hm);
}
}