package com.cg.corejava;

public class StringHandling {

	public static void main(String[] args) {
		// String Building
		
		String s=new String("Shruti");
		s.concat("Patil");   //immutable string
		System.out.println(s);
		
		StringBuffer st=new StringBuffer("Shruti");
		st.append("Patil");    //mutable stringbuffer
		System.out.println(st);

		String str="Snehal";
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.length());
		
		System.out.println(str.equals("Snehal"));
		System.out.println(str.equals("snehal"));
		System.out.println(str.equalsIgnoreCase("SNEHAL"));
		
		//Substring
		System.out.println(str.substring(0,4));
		System.out.println(str.substring(4));
		
		String a="Helllo";
		int b=10;
		int c=20;
		int d=30;
		
		System.out.println(a+b+c+d);
		System.out.println(d+c+a+b);
		System.out.println(b+c+d+a);
		
		System.out.println(a.charAt(2));
		System.out.println(a.endsWith("o"));
		System.out.println(a.endsWith("H"));
		
	}

}