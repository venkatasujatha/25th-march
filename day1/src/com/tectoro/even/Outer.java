package com.tectoro.even;

public class Outer 
{
	public class Inner
	{
		private int x=20;
		
		public void min1() 
		{
		System.out.println(" some value " +x);
	
	}
	}
	public static void main(String[] args) 
	{
		Outer o1=new Outer();
		Outer.Inner in=o1.new Inner();
		in.min1();
	}

}
