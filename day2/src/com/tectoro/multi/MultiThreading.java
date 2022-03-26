package com.tectoro.multi;

import java.util.Scanner;

public class MultiThreading {

	public static void main(String[] args) 
	{
		Scanner sn= new Scanner(System.in);
		System.out.println(" enter first num: ");
		int a=sn.nextInt();	
		System.out.println(" enter second num: ");
		int b=sn.nextInt();
		AddtionTask as=new AddtionTask();
		as.add(a, b);
		CharacterPrint cp=new CharacterPrint();
		cp.Print();
		NUmberPrinting np=new NUmberPrinting();
		np.NumPrint();
		}
	}
