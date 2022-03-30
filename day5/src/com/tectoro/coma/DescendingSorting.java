package com.tectoro.coma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


class compareName implements Comparator<Employee>
{
	public int compare(Employee f1,Employee f2)
	{
		String s1=f1.getName();
		String s2=f2.getName();
		int sw=s1.compareTo(s2);
		return sw;
		
	}
}
class compareEmpNo implements Comparator<Employee>
{
	public int compare(Employee f1,Employee f2)
	{
		Integer s1=f1.getEmpNo();
		Integer s2=f2.getEmpNo();
		return s1.compareTo(s2);
		
		
	}
}
class compareDepartment implements Comparator<Employee>
{
	public int compare(Employee f1,Employee f2)
	{
		String s1=f1.getDepartment();
		String s2=f2.getDepartment();
		return s1.compareTo(s2);
		
		
	}
}


class Employee1 implements Comparable<Employee1> 
{
	private String Name;
	private int EmpNo;
	private String Department;
	
public Employee1(String Name,int EmpNo,String Department)
{
	this.Name=Name;
	this.EmpNo=EmpNo;
	this.Department=Department;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getEmpNo() {
	return EmpNo;
}

public void setEmpNo(int EmpNo) {
	EmpNo = EmpNo;
}

public String getDepartment() {
	return Department;
}

public void setDepartment(String Department) {
	Department = Department;
}

@Override
public String toString() {
	return "Employee1 [Name=" + Name + ", EmpNo=" + EmpNo + ", Department=" + Department + "]";
}

@Override
public int compareTo(Employee1 o) 
{
	
	return 0;
}


}


public class DescendingSorting 
{

	public static void main(String[] args) 
	{	
		Employee t1=new Employee("sabari",123,"Sales");
		Employee t2=new Employee("ganga",124,"Account");
		Employee t3=new Employee("venkatadri",128,"Developer");
		Employee t4=new Employee("neeladri",129,"IT");
		Employee t5=new Employee("rajadhani",125,"Hr");
		
		
		
		Scanner sn=new Scanner(System.in);
		System.out.println(" enter your choice: ");
		System.out.println(" 1:Name ");
		System.out.println(" 2:EmpNo ");
		System.out.println(" 3:Department ");
		
		int choice=sn.nextInt();
		ArrayList<Employee> st1=new ArrayList<Employee>();
		st1.add(t1);
		st1.add(t2);
		st1.add(t3);
		st1.add(t4);
		st1.add(t5);
		
		if(choice==1)
		{
			Collections.sort(st1,new compareName());
		}
		else if(choice==2)
		{
			Collections.sort(st1,new compareEmpNo());
		}
			
		else if(choice==3)
		{
			System.out.println("s");
			Collections.sort(st1,new compareDepartment());
		}
			
		for (Employee tr : st1)
		{
			System.out.println(tr);
		}
				
	}

	}