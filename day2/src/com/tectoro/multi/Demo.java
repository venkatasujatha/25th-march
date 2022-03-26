package com.tectoro.multi;

public class Demo 
{

	public static void main(String[] args) 
	{
		AddtionTask as=new AddtionTask();
		CharacterPrint cp=new CharacterPrint();
		NUmberPrinting np=new NUmberPrinting();
		as.start();
		cp.start();
		np.start();
	}

}
