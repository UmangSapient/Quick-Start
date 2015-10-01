package com.training;

public class AutoBoxing 
{

	public void add (int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	
	//Method overloading by changing argument type
	
	
	public void add (Integer a,Integer b)
	{
		int c=a+b+100;
		System.out.println(c);
	}
}
