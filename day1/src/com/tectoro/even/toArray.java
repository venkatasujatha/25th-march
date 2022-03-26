package com.tectoro.even;

import java.util.ArrayList;
import java.util.stream.Stream;

public class toArray {

	public static void main(String[] args) 
	{
		ArrayList<Integer> y=new ArrayList<Integer>();
		y.add(30);
		y.add(50);
		y.add(50);
		y.add(70);
		Integer[] i=y.stream().toArray(Integer[]::new);
		/*for(Integer j:i)
		{
			System.out.println(j);
		}
		*/
		Stream.of(i).forEach(System.out::println);

	}

}
