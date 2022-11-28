package com.cg.corejava;

public class HybridInheritance {

	public static void main(String[] args) 
	{
		G obj1 =new G();
		obj1.Method2(45);
		obj1.Method1(12);
		
		H obj2 =new H();
		obj2.Method3(100);
		obj2.Method1(101);
		
	}
}
class F
{
	int i=800;
	public void Method1(int i)
	{
		System.out.println("This is a parent class "+i);
	}
}

class G extends F
{
	
	public void Method2(int j)
	{
		System.out.println("This is a child class 1 "+i+"and "+j);
	}
}

class H extends F
{
	
	
	public void Method3(int k)
	{
		
		System.out.println("This is a child class 2 "+i+"and "+k);
	}
}