package com.tectoro.multi;

public class NUmberPrinting extends Thread
{
	public void run() 
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
