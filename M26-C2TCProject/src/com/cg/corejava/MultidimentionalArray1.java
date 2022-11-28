package com.cg.corejava;

public class MultidimentionalArray1 {

	public static void main(String[] args) {

		int arr[][]= {{10,20,30},{40,50},{60},{70,80}};   //2D array
		
		System.out.println("output of 2D array:\n");
		
		System.out.println(arr);
		System.out.println(arr[3][0]);
		System.out.println(arr[2][0]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][0]);
		
		//3D array
		
		int arr1[][][]= {{{10,20},{30,20}},{{50,70,80},{10}}};
		System.out.println("output of 3D array:\n");
		
		System.out.println(arr1);
		System.out.println(arr1[0][0][0]);
		System.out.println(arr1[1][1][0]);
		System.out.println(arr1[2][0][1]);
		
		

	}

}