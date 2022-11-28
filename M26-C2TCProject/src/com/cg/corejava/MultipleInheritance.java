package com.cg.corejava;

public class MultipleInheritance {

	public static void main(String[] args) 
	{
		S obj=new S();
		obj.displayA();
		obj.displayB();
	}
}

interface A1
{
	void displayA();
}

interface B1
{
	void displayB();
}

class S implements A1,B1
{

	@Override
	public void displayB()
	{
		System.out.println("From interface A1");
		
	}

	@Override
	public void displayA() 
	{
		System.out.println("From interface B1");
		
	}
	
}