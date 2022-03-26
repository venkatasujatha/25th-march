package com.tectoro.multi;
interface sujatha
{
	void show();
}

public class StaticMethods 
{
	public static void m1()
	{
		System.out.println("sujatha");
	}

	public static void main(String[] args) 
	{
		sujatha c=StaticMethods::m1;
		c.show();

	}

}
