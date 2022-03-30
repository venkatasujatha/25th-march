package com.tectoro.coma;

import java.util.TreeSet;

public class TRains
{
	public static void main(String[] args) 
	{	
		Train1 t1=new Train1("sabari",123,"10:00");
		Train1 t2=new Train1("ganga",124,"11:00");
		Train1 t3=new Train1("venkatadri",128,"12:00");
		Train1 t4=new Train1("neeladri",129,"01:00");
		Train1 t5=new Train1("rajadhani",125,"02:00");
		
		
		TreeSet<Train1> st=new TreeSet<Train1>();
		st.add(t1);
		st.add(t2);
		st.add(t3);
		st.add(t4);
		st.add(t5);
		for (Train1 tr : st) 
		{
			System.out.println(tr);
		}
	}

	}


