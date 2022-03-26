package com.tectoro.even;

import java.util.ArrayList;
import java.util.function.Consumer;

public class EachElement {

	public static void main(String[] args) 
	{
		ArrayList e=new ArrayList();
		e.add(10);
		e.add(29);
		e.add(12);
		Consumer<Integer> i=g->
		{
			System.out.println("the square of "+g+"is"+(g*g));
		};
		e.stream().forEach(i);
		}

	}

