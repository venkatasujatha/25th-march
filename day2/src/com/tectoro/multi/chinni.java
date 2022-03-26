package com.tectoro.multi;

public class chinni {

	public static void main(String[] args) 
	{
		main m=new main();
		Thread t1=new Thread(m);
		Thread t2=new Thread(m);
		Thread t3=new Thread(m);
		
		t1.setName("ADD");
		t2.setName("CHAR");
		t3.setName("NUM");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
