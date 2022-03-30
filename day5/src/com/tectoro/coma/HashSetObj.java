package com.tectoro.coma;
//Write a program to search an object in HashSet.
import java.util.HashSet;

public class HashSetObj 
{

	public static void main(String[] args) 
	{
		HashSet<String> h=new HashSet<String>();
		h.add("sujatha");
		h.add("sunny");
		h.add("prash");
		h.add("salman");
		h.add("sumera");
		if(h.contains("sunny"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
	}

}
