package com.tectoro.multi;

import java.util.Scanner;

interface A1
{
	default void Show()
	{
		Scanner sn=new Scanner(System.in);
		System.out.println(" enter first num ");
		int a=sn.nextInt();
		System.out.println(" enter second num ");
		int b=sn.nextInt();
		int c=a+b;
		System.out.println(c);
		
	}
}
class test implements A1
{
	public void Show()
	{
		Scanner sn=new Scanner(System.in);
		System.out.println(" enter first num ");
		int a=sn.nextInt();
		System.out.println(" enter second num ");
		int b=sn.nextInt();
		int c=a*b;
		System.out.println(c);
		
	}
}
public class DefMethod 
{

	public static void main(String[] args) 
	{
		test t=new test();
		t.Show();

	}

}
