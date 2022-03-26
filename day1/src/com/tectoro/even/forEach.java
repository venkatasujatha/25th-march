
package com.tectoro.even;

import java.util.ArrayList;
import java.util.function.*;

public class forEach {

	public static void main(String[] args) 
	{
		ArrayList<Integer> e=new ArrayList<Integer>();
		e.add(10);
		e.add(29);
		e.add(12);
		e.stream().forEach(h->
		{
			System.out.println("the square of "+h+"is"+(h*h));
		});
		
		}

	}

