package com.gentech.stringassignment;

public class Assignment3 {

	public static void main(String[] args) 
	{
		a();

		b();
		
		c();
	}
	
	static void a()
	{
		System.out.println("a");
		String s = "welcome";
		String res = "";
		
		for(int i = s.length()-1;i>=0;i--)
		{
			res = res + s.charAt(i);
		}
		System.out.println(res);
	}
	
	static void b()
	{
		System.out.println("b");
		String s = "welcome";
		char res[] = new char[s.length()];
		int c = 0;
		
		for(int i = s.length()-1;i>=0;i--)
		{
			res[c] = s.charAt(i);
			c++;
		}
		for(int i = 0;i<res.length;i++)
		{
			System.out.print(res[i]);
		}
		System.out.println();
	}
	
	static void c()
	{
		System.out.println("c");
		String s = "welcome";
		String res = "";
		
		for(int i = s.length()-1;i>=0;i--)
		{
			res = res + s.substring(i,i+1);
		}
		System.out.println(res);
	}
}
