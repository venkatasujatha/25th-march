package com.tectoro.contains;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	String Name;

	public Employee(String Name) 
	{
		super();
		this.Name = Name;
	}

	public String getName() 
	{
		return Name;
	}

	public void setName(String name) 
	{
		this.Name = Name;
	}	
}
public class CountO 
{

	public static void main(String[] args) 
	{
		Employee s1=new Employee("python");
		Employee s2=new Employee("john");
		Employee s3=new Employee("sujatha");
		Employee s4=new Employee("Java");
		Employee s5=new Employee("Oracle");
		Employee s6=new Employee("john");
		Employee s7=new Employee("chinnu");
		Employee s8=new Employee("Java");
		String a=s1.getName();
		List<Employee> e=new ArrayList<Employee>();
		e.add(s1);
		e.add(s2);
		e.add(s3);
		e.add(s4);
		e.add(s5);
		e.add(s6);
		e.add(s7);
		e.add(s8);
		for(int i=0;i<=e.size()-1;i++) {
			if(e.get(i).equals("john")) {
		System.out.println(e.get(i));
		}
		}
		//e.forEach(Stst)
/*	r(Employee r:e)
		{
			System.out.println(r.getName());
			
		}*/
		

	}

}
