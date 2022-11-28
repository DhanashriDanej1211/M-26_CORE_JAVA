package com.cg.corejava;

import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {
		 Scanner obj= new Scanner (System.in);   //Used Scanner class
		 
		 System.out.println("Enter Value of num1");
		 
		 int num1=obj.nextInt();
		 
		 System.out.println("Enter Value of num2");
		 
		 int num2=obj.nextInt();
		 
		 int sum=num1+num2;
		 
		 System.out.println("The sum is::"+sum);


	}

}