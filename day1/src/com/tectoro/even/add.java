package com.tectoro.even;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

	public class add 
	{

	public static void main(String[] args) 
	{
		ArrayList<Integer> as=new ArrayList<Integer>();
		as.add(10);	
		as.add(20);
		as.add(50);
		as.add(35);
		as.add(70);
		as.add(25);
		System.out.println(as);
		//add 5 to the existing elements
		List<Integer> ls1=as.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(ls1);
	}
	}