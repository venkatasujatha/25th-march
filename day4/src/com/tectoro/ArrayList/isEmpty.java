package com.tectoro.ArrayList;

import java.util.Arrays;
import java.util.List;

public class isEmpty 
{

	public static void main(String[] args) 
	{
		List<Integer> f=Arrays.asList(10,20,76,58,40);
		if(f.isEmpty())
		{
			System.out.println("ArrayList is empty");
		}
		else
		{
			System.out.println("ArrayList is not empty");
		}
		System.out.println(f);
		f.forEach(System.out::println);
	}

}
