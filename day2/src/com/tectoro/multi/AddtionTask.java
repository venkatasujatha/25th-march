package com.tectoro.multi;

import java.util.Scanner;

public class AddtionTask extends Thread
{
	public void run() 
	{
		Scanner sn= new Scanner(System.in);
		System.out.println(" enter first num: ");
		int a=sn.nextInt();	
		System.out.println(" enter second num: ");
		int b=sn.nextInt();
		System.out.println("addition task started:");
		int c=a+b;
		System.out.println(c);
		
		System.out.println("addion task completed");
	}
	
}
