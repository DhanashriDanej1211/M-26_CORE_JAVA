package com.cg.corejava;

public class AbstractDemo {

	public static void main(String[] args) 
	{
		child obj=new child();
		obj.noOfWheels();
	}
}

abstract class parent
{
	abstract void noOfWheels();
}

class child extends parent
{
	void noOfWheels()
	{
		System.out.println("2");
	}
	
}