package com.tectoro.multi;

public class CharacterPrint extends Thread
{
	public void run()
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
}
