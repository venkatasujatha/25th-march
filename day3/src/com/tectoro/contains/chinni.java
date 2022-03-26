package com.tectoro.contains;
//Create a LinkedList with Strings, check whether a given string exists, get the first and last index of a particular string.
import java.util.LinkedList;
import java.util.Scanner;

public class chinni 
{

	public static void main(String[] args) 
	{
		LinkedList u=new LinkedList();
		u.add("yash");
		u.add("sameera kkkkk");
		u.add("prashanth");
		u.add("prashanth1");
		u.add("prashanth2");
		u.add("nareshkkk somthing hello my");
		u.add("knfjnjg");
		u.add("prashanth1");
		u.add("prashanth1");
		System.out.println(u.indexOf("prashanth1"));
		System.out.println(u);
		System.out.println(u.lastIndexOf("prashanth1"));
		 Scanner s=new Scanner(System.in); System.out.println(" Enter a string ");
		 String a=s.nextLine();
		  
		  if(u.contains(a)) 
		  { 
			  System.out.println("valid");
			  }
		  else 
		  	 { 
		  		  System.out.println("invalid"); 
		  	 }
	}
}
