package com.tectoro.even;
import java.util.stream.Collectors;
import java.util.*;
//EVEN NUMBERS
public class Even3 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> as=new ArrayList<Integer>();
		as.add(10);	
		as.add(20);
		as.add(50);
		as.add(35);
		as.add(70);
		as.add(25);
		System.out.println(as);

		List<Integer> ls=as.stream().filter(i->i%2==0).collect(Collectors.toList());  
		System.out.println(ls);   
}
}