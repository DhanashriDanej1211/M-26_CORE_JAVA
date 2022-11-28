package com.cg.corejava;

public class MultilevelInheritance {

	public static void main(String[] args) 
	{
		C obj =new C();
		obj.display();
		obj.show();
		obj.view();
		
	}
}

class D
{
	public void view()
	{
		System.out.println("Parent class");
	}
	
}

class E extends D
{
	public void show()
	{
		System.out.println("child1 class");
	}
}

class C extends E
{
	public void display()
	{
		System.out.println("child2 class");
	}
}