package com.cg.corejava;

public class ConstructorProgram {
	
	public ConstructorProgram(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	String name;
	int rollNo;

	public static void main(String[] args)
	{
		ConstructorProgram cp1=new ConstructorProgram("Shruti",78);
		ConstructorProgram cp2=new ConstructorProgram("Ishwari",79);
		
		System.out.println("Name::"+cp1.name);
		System.out.println("RollNo::"+cp1.rollNo);
		System.out.println("Name::"+cp2.name);
		System.out.println("RollNo::"+cp2.rollNo);

	}

}