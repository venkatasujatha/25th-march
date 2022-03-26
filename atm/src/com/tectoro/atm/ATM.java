package com.tectoro.atm;

import java.util.Scanner;
class invalidUserInputException extends Exception
{
	public String getMessage()
	{
	return "invalid userInput.Please try again";
	
	}
}

public class ATM 
{
	int acc_num1=1457;
	int password=5555;
	int  un;
	int pwd;

public void acceptInput()
{
	Scanner sn=new Scanner(System.in);
	System.out.println("enter acc_num");
	un=sn.nextInt();
	System.out.println("enter password");
	pwd=sn.nextInt();
}
public void verify() throws Exception
{
	if(acc_num1==un && password==pwd)
	{
		System.out.println("collect money");
	}
	else
	{
		invalidUserInputException iue=new invalidUserInputException();
		System.out.println(iue.getMessage());
		throw iue;

	}
	}
}
class Bank
{
	
	public void initiate()
	{
		
		try
		{

			ATM a=new ATM();
			a.acceptInput();       //first time
			a.verify();
		}
		catch(Exception e)
		{
			try
			{
			ATM a=new ATM();
			a.acceptInput();
			a.verify();              //second time
			}
			catch (Exception e1) {
			System.out.println("Card is blocked");
			}
		}
	}
}








