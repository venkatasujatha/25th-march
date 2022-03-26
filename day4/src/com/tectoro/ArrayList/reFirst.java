package com.tectoro.ArrayList;

import java.util.LinkedList;

public class reFirst 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> lt=new LinkedList<Integer>();
		lt.add(10);
		lt.add(70);
		lt.add(80);
		lt.add(30);
		System.out.println(lt);
		lt.removeFirst();
		System.out.println(lt);
	}

}
