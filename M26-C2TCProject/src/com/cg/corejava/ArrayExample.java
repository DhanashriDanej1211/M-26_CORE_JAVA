package com.cg.corejava;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) 
	{

		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter array element");
		int size=Sc.nextInt();
		
		int arr[]=new int [size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=Sc.nextInt();
		}
		
		System.out.println("Enter the element you want to search i.e x");
		int x=Sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			if(x==arr[i])
			{
				System.out.println("x is:"+x);
			}
		}
	}

}