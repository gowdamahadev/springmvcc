package com.test;

public class ArrayScore 
{
	public static boolean check(int[]array) 
	{
		for(int i=1; i<array.length; i++)
		{
			if(array[i]<array[i-1])
			{
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,3,4};
		System.out.println(check(arr));
	
		
		int arr1[]= {2,5,6};
		System.out.println(check(arr1));
	}

	}


