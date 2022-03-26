package com.tectoro.multi;

public class LamdaWithMulti 
{

	public static void main(String[] args) 
	{
		Runnable i=()->{
			for(int t=0;t<=10;t++)
			{
				System.out.println("print elements");
			}
		};
		
		Thread t=new Thread(i);
		t.start();
		for(int u=0;u<=10;u++)
		{
			System.out.println(" print elements of thread ");
		}

	}

}
