package com.tectoro.multi;

import java.util.Scanner;

public class main implements Runnable
{
	public void run()
	{	
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(name.equals("ADD")==true)
		{
			addition();
		}
		if(name.equals("CHAR")==true)
		{
			CharacterPrint();
		}
		else
		{
			numPrint1();
		}
	}
		 void addition()
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
		 void CharacterPrint()
		 {
			 System.out.println("character printing task started:");
				for(int i=65;i<=75;i++)
				{
					System.out.println((char)i);
					try
					{
					
					Thread.sleep(2000);
					}
					catch (InterruptedException e) 
					{
						System.out.println("Exception occured");
					}
				}
				System.out.println("character printing task completed:");
		 }
		 void numPrint1()
		 {
			 System.out.println("number printing task started:");
				for(int i=0;i<=20;i++)
				{
					System.out.println(i);
					try
					{
					
					Thread.sleep(2000);
					}
					catch(InterruptedException e)
					{
						System.out.println("Exception occured");
					}
				}
				System.out.println("number printing task completed:");
		 	}
	}
