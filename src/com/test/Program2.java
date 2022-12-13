package com.test;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String");
	String str=sc.next();
	
	if(str.length()<2)
	{
		System.out.println("error");
	}
	else
	{
		String s=str.substring(0,2);
		System.out.println("__________________________________________");
		
		System.out.println(s+str+s);
	}
			
	
	}

	}



