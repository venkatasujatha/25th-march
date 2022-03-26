package com.tectoro.ArrayList;

import java.util.ArrayList;

public class addAll 
{
	public static void main(String[] args)
	{
		
			ArrayList i=new ArrayList();
			i.add(10);
			i.add(40);
			i.add(50);
			i.add(80);
			i.add(50);
			
			//addAll()
			
			i.addAll(4,i);
			System.out.println(i);
}
}
