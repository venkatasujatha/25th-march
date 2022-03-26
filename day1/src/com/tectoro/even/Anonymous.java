package com.tectoro.even;

abstract class sujatha
{
	abstract void run();
}
public class Anonymous {

	public static void main(String[] args) 
	{
		sujatha a=new sujatha()
		{
			public void run()
			{
				System.out.println("printing sujatha");
			}
		};
		a.run();
	}

}
