package com.tectoro.ArrayList;

import java.util.LinkedList;

public class Hg1 
{
	String Name;
	public void Hg1(String Name)
	{
		this.Name=Name;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public static void main(String[] args) 
	{
		LinkedList<String> ls=new LinkedList<String>();
		Hg1.add(new Hg1("sujatha"));

	}

}
