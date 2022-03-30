package com.tectoro.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class sujatha
{
	String Name;
	int id;
	
	
	public sujatha(String Name,int id)
	{
		
		this.Name=Name;
		this.id=id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "sujatha [Name=" + Name + ", id=" + id + "]";
	}
	
}

public class liToMap 
{

	public static void main(String[] args) 
	{
		List<sujatha> l=new ArrayList<sujatha>();
		l.add(new sujatha("SANA",1));
		l.add(new sujatha("SAMEERA",2));
		l.add(new sujatha("SANJAY",3));
		System.out.println(l.get(1));
		
		HashMap<String, Integer> e=new HashMap<String, Integer>();
		for(sujatha e1:l)
		{
			
			e.put(e1.getName(),e1.getId());
			
		}
		System.out.println(e);
	}

}
