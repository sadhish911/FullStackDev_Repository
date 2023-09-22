package com.gentech.staticrecursionvoidassignment;

public class recdemo {

	public static void main(String[] args) {
		int n = rec(1);
		System.out.println("main"+n);
		
	}
	
	static int rec(int n)
	{
		while(n<=3)
		{
		System.out.println(n);
		n++;
		rec(n);
		System.out.println("after "+n);
		
		}
		return n;
	}

}
