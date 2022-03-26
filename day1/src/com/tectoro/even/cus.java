package com.tectoro.even;


import java.util.stream.Collectors;
import java.util.*;
	public class cus 
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
		//sorting the elements descending order
		List<Integer> ls5 = as.stream().sorted((i,j)->j.compareTo(i)).collect(Collectors.toList());
		System.out.println(ls5);
		List<Integer> ls6 = as.stream().sorted((i,j)->i.compareTo(j)).collect(Collectors.toList());
		System.out.println(ls6);
	}
	}
		