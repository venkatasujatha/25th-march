
package com.tectoro.day1;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Alphabet {

	public static void main(String[] args) 
	{
		LinkedList<String> ls1=new LinkedList<String>();
		
		ls1.add("sujatha");
		ls1.add("prasanth");
		ls1.add("anusha");
		ls1.add("asha");
		
		List<String> y = ls1.stream().filter(i->i.startsWith("a")).collect(Collectors.toList());
		System.out.println(y);
	}

}