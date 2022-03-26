package com.tectoro.contains;

import java.util.ArrayList;
import java.util.Scanner;

public class conTask 
{
	public static void main(String[] args)
	{
		 ArrayList<String> as=new ArrayList<String>();
		  as.add("Sujatha");
		  as.add("Suneetha"); 
		  as.add("sunny"); 
		  as.add("Arjun"); 
		  System.out.println(as);
		  Scanner s=new Scanner(System.in); 
		  System.out.println("Enter Remove element");
		  String a=s.nextLine();
		  if(as.contains(a)) 
		  { 
			  System.out.println(as.remove(a));
			  System.out.println(as);
		  }
		  else 
		  { System.out.println("invalid"); 
		  }
		  
	}

}
