package com.test;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class Hashmap {

	public static void check(Map<String, String> ref) {
	Map<String, String> map=new HashMap<String, String>(ref);
	map.put("bread","butter");
	if(map.containsKey("ice cream")) {
	map.put("ice cream", "cherry");
	}
	System.out.println(map);
	}
	public static void main(String[] args) {
	Map<String, String> ref=new HashMap<String, String>();
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number of elements");
	int no=scan.nextInt();
	System.out.println("enter the elements");
	for(int i=1; i<=no; i++) {
	String keys=scan.next();
	String values=scan.next();
	ref.put(keys, values);
	}

	check(ref);
	}
	}



