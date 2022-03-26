package com.tectoro.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class peeklin 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> j=new LinkedList<Integer>();
		j.add(10);
		j.add(20);
		j.add(40);
		System.out.println(j);
		Integer t=j.peekFirst();
		System.out.println(t);
		System.out.println(j);
		Integer t1=j.peekLast();
		System.out.println(t1);
		System.out.println(j);
	}

}
