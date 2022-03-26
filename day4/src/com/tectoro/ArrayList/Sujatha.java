package com.tectoro.ArrayList;

import java.util.ArrayList;

public class Sujatha 
{

	public static void main(String[] args) 
	{
		
		ArrayList i=new ArrayList();
		i.add(10);
		i.add(40);
		i.add(50);
		i.add(80);
		i.add(50);
		//add()
		
		System.out.println(i); 
		//adAll()
		i.addAll(4,i);
		System.out.println(i);
		//remove()
		i.remove(2);
		System.out.println(i);
		//removeAll()
		i.removeAll(i);
		System.out.println(i);
		i.retainAll(i);
		System.out.println(i);
		//new arrayList
		ArrayList a=new ArrayList();
		a.add(20);
		a.add(10);
		a.add(40);
		a.add(50);
		a.add(60);
		System.out.println(a);

	}

}
