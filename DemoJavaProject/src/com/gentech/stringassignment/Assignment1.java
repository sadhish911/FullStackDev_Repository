package com.gentech.stringassignment;

public class Assignment1 {

	public static void main(String[] args)
	{
		a();
		System.out.println();
		b();
		System.out.println();
		c();
	}
	
	static void a()
	{
		String s = "welcome";
		for(int i = 0;i<s.length();i++)
		{
			for(int j = 0;j<=i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
	
	static void b()
	{
		String s = "welcome";
		for(int i = s.length()-1;i>=0;i--)
		{
			for(int j = 0;j<=i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
	
	static void c()
	{

		String s = "welcome";
		for(int i = 0;i<=s.length();i++)
		{
			for(int j = 0;j<i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		for(int i = s.length()-1;i>=0;i--)
		{
			for(int j = 0;j<i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
}
