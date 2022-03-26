package com.tectoro.even;

import java.util.ArrayList;
import java.util.List;
	public class Max 
	{
	public static void main(String[] args) 
	{
		ArrayList<Integer> fd=new ArrayList<Integer>();
		fd.add(10);
		fd.add(20);
		fd.add(30);
		fd.add(40);
		Integer max=fd.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println(max);
	}
}
