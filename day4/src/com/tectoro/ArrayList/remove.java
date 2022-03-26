package com.tectoro.ArrayList;
import java.util.ArrayList;
public class remove 
{

	public static void main(String[] args) 
	{
		
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(80);
		l.add(50);
		
		//remove()
		
		l.remove(2);
		System.out.println(l);
}
}
