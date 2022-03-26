package com.tectoro.multi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FristAndLast 
{

	public static void main(String[] args) 
	{
		ArrayList<String> as1=new ArrayList<String>();
		as1.add("s");
		as1.add("p");
		as1.add("r");
		as1.add("p");
		as1.add("r");
		System.out.println(as1);
		System.out.println(as1.indexOf("p"));
		System.out.println(as1.lastIndexOf("r"));
	}

}
