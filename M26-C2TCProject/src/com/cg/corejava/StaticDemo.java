package com.cg.corejava;

public class StaticDemo 
{
	String name;
	int roll;
	static String coll="XYZ college";

	void display()
	{
		System.out.println(name+" "+roll+" "+coll);
	}
	static void modify()
	{
		coll="APCOER college";
	}
	
	public StaticDemo(String name,int roll)
	{
		super();
		this.name=name;
		this.roll=roll;
	}

	public static void main(String[] args)
	{
		StaticDemo s1=new StaticDemo("Shruti",1);
		StaticDemo s2=new StaticDemo("Snehal",2);
		StaticDemo s3=new StaticDemo("Jidnyasa",3);
		modify();
		s1.display();
		s2.display();
		s3.display();
	}

}