package com.tectoro.multi;
interface Inter
{
	public void Star();
}
public class FunctionalInterface 
{

	public static void main(String[] args) 
	{
		
		Inter i=()->System.out.println("functional: ");
		i.Star();
	}

}
