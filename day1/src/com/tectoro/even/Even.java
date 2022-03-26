package com.tectoro.even;

import java.util.stream.Collectors;
import java.util.*;


public class Even {

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
		//EVEN NUMBERS
		List<Integer> ls=as.stream().filter(i->i%2==0).collect(Collectors.toList());  
		System.out.println(ls);   
		
		//add 5 to the existing elements
		List<Integer> ls1=as.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(ls1);
		//count the even numbers
		long ls2=as.stream().filter(i->i%2==0).count();
		System.out.println(ls2);
		//sorting the elements
		List<Integer> ls3=as.stream().sorted().collect(Collectors.toList());
		System.out.println(ls3);
		//sorting the elements descending order
		List<Integer> ls4=as.stream().sorted((i,j)->((i<j)?+1:(i>j)?-1:0)).collect(Collectors.toList());
		System.out.println(ls4);
		//sorting the elements descending order
		List<Integer> ls5 = as.stream().sorted((i,j)->j.compareTo(i)).collect(Collectors.toList());
		System.out.println(ls5);
		List<Integer> ls6 = as.stream().sorted((i,j)->i.compareTo(j)).collect(Collectors.toList());
		System.out.println(ls6);
		
	}
}