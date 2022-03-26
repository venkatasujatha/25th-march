package com.tectoro.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Contains 
{


	public static void main(String[] args) 
	{
		
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(80);
		l.add(50);
		
		//contains()
		Scanner sn=new Scanner(System.in);
		System.out.println(" enter value ");
		int a=sn.nextInt();
		if(l.contains(a))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		System.out.println(l);
}
}
