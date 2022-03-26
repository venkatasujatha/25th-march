package com.tectoro.contains;
//Create an ArrayList with Strings and count the occurrence of "Java" string and "Oracle" string. whichever is occurring less times, delete it
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class CreDe {

	public static void main(String[] args) 
	{
		ArrayList suj=new ArrayList();
		suj.add("sujatha");
		suj.add("rani");
		suj.add("java");
		suj.add("oracle");
		suj.add("java");
		suj.add("oracle");
		suj.add("java");
		System.out.println(suj);
		Scanner sn=new Scanner(System.in);
		System.out.println("");
		int java=0;
		int oracle=0;
		for(int i=0;i<suj.size();i++)
		{
			if(suj.get(i).equals("java"))
			{
				java++;
			}
			if(suj.get(i).equals("oracle"))
			{
				oracle++;
			}
			
		}
		for(int i=0;i<suj.size();i++)
		{
			if(java<oracle)
			{
				suj.remove("java");
			}
			if(java>oracle)
			{
				suj.remove("oracle");
			}
		}
		System.out.println(suj);
    }   

}


