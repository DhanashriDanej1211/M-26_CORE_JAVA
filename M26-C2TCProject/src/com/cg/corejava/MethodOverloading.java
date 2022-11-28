package com.cg.corejava;

public class MethodOverloading {

	public static void main(String[] args)
	{
		Poly obj=new Poly();
		obj.m();
		obj.m(161);
		obj.m(2.5);
		
		//Automatic Promotion  
		obj.m('A');
		obj.m(161);
		obj.m(5.6f);

	}

}
class Poly
{
	public void m()
	{
		System.out.println("No args");
	}
	
	public void m(int i)
	{
		System.out.println("Int args");
	}
	
	public void m(double d)
	{
		System.out.println("Double args");
	}
}