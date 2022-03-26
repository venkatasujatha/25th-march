package com.tectoro.ArrayList;


import java.util.LinkedList;
import java.util.List;

public class Hero
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> j=new LinkedList<Integer>();
		j.add(10);
		j.add(20);
		j.add(40);
		System.out.println(j);
		Integer t=j.pollFirst();
		System.out.println(t);
		System.out.println(j);
		Integer t1=j.pollLast();
		System.out.println(t1);
		System.out.println(j);
	}

}
