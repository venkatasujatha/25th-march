package com.tectoro.multi;

import java.lang.reflect.Constructor;
@FunctionalInterface
interface pras
{
	public void show();
}
public class MethodRef 
{
	public static void s1()
	{
		System.out.println("static method");
	}
	public  void s4()
	{
		System.out.println("Instance method");
	}
	
	/*public MethodRef()
	{
		System.out.println("Constructor method");
	}*/
	public static void main(String[] args) 
	{
		//static 
		pras s8=MethodRef::s1;
		s8.show();
		
		//instance
		MethodRef m1=new MethodRef();
		pras s2=m1::s4;
		s2.show();
		
		//constructor
		
		doun d=Student::new;
		d.chinni();
		 
		
	}

}
interface doun
{
public Student chinni();


}
class Student 
{
	public Student()
	{
		System.out.println("constructor");
	}
}





















