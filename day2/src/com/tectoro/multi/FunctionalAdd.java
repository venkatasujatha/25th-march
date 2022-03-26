package com.tectoro.multi;
interface small
{
	public void sum(int a,int b);
}
public class FunctionalAdd 
{
	public static void main(String[] args) 
	{
		small s1=(a,b)->System.out.println(" sum is "+(a+b));
		s1.sum(10,20);
	}

}
