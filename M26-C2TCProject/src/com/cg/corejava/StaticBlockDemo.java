package com.cg.corejava;

public class StaticBlockDemo {

	public static void main(String[] args)
	{
		System.out.println("I am Main");

	}
	
	static void m()
	{
		System.out.println("I am Static Method");
	}
	
	static
	{
		System.out.println("Hello!");
		m();
	}
	
	static
	{
		System.out.println("Good Morning!");
	}

}