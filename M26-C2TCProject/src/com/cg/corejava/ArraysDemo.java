package com.cg.corejava;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args)
	{
		
		int arr1[]={1,8,5,6,7,2};
		int arr2[]={1,11,2,85,4,5};
		
		Arrays.sort(arr1);
		for(int i:arr1)
		{
			System.out.println(i+" ");
		}
		System.out.println(Arrays.mismatch(arr1, arr2));
		System.out.println(Arrays.compare(arr1, arr2));
		System.out.println(Arrays.hashCode(arr1));
		
		
	}

}