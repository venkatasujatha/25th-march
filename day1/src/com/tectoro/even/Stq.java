package com.tectoro.even;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stq{

	public static void main(String[] args) 
	{
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("sujatha");
		ar1.add("prashanth");
		ar1.add("ram");
		ar1.add("bharathi valluru");
		System.out.println(ar1);
		ar1.add("raziya");
	    Comparator<String> com=(s1,s2)->{
	    	int y= s1.length();
	    	int e=s2.length();
	    	if(y<e) return -1;
	    	else if(y>e) return +1;
	    	else return s1.compareTo(s2);
	    };
	    List<String> asw = ar1.stream().sorted(com).collect(Collectors.toList());
	    System.out.println(asw);
	}
}
