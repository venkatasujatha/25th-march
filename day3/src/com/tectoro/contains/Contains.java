package com.tectoro.contains;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Contains 
{
	int id;
	String name;
	String email;
	

	public Contains(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public static void main(String[] args) 
	{
		Contains C1=new Contains(1, "sujatha", "s@gmail.com");
		Contains C2=new Contains(2, "sujith", "suj@gmail.com");
		Contains C3=new Contains(3, "Anil", "Anil@gmail.com");
		List<Contains> e=new ArrayList<Contains>();
		e.add(C1);
		e.add(C2);
		e.add(C3);
		e.remove(C1);
		System.out.println(e);
		Iterator<Contains> l=e.iterator();
		
		for (Contains b : e) {
			System.out.println(b.id+" "+b.name+"  "+b.email);
			
			
		}
		
		
		
		/*
		 * ArrayList<String> as=new ArrayList<String>(); as.add("Sujatha");
		 * as.add("Suneetha"); as.add("sunny"); as.add("Arjun"); System.out.println(as);
		 * Scanner s=new Scanner(System.in); System.out.println("Enter Remove element");
		 * String a=s.nextLine(); if(as.contains(a)) { System.out.println(as.remove(a));
		 * System.out.println(as); }else { System.out.println("invalid"); }
		 * 
		 * 
		 * //System.out.println((as.stream().filter(i->i.contains("Suneetha")))
		 * //System.out.println(s);
		 */			

	}

}
