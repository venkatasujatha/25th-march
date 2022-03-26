package com.tectoro.even;



import java.util.stream.Collectors;
import java.util.*;

	public class EvenNum 
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
		//count the even numbers
		long ls2=as.stream().filter(i->i%2==0).count();
		System.out.println(ls2);
	}
	}