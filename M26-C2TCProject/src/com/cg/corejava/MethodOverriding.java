package com.cg.corejava;

public class MethodOverriding {

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.Hobby();
		c.Property();
	}
}

class Parent
{
	public void Property()
	{
		System.out.println("Home/Place/cash");
	}
	
	public void Hobby()
	{
		System.out.println("Photography/Reading");
	}
	
}

class Child extends Parent
{
	public void Hobby()
	{
		System.out.println("Diary Writing");
	}
	
}