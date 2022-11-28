package com.cg.corejava;

public class OuterClassDemo {
	
	int x=50;
	static int y=100;
	
						static class Inner
						{
							void display()
							{
								System.out.println(y);
							}
						}

	public static void main(String[] args) 
	{
		OuterClassDemo.Inner obj=new OuterClassDemo.Inner();
		obj.display();
	}

}