package com.tectoro.even;

import java.util.stream.Collectors;
import java.util.*;

	public class descending 
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
		List<Integer> ls4=as.stream().sorted((i,j)->((i<j)?+1:(i>j)?-1:0)).collect(Collectors.toList());
		System.out.println(ls4);
	}
	}