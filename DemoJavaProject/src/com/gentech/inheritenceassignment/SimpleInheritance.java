package com.gentech.inheritenceassignment;

public class SimpleInheritance {

	public static void main(String[] args) 
	{
		a12 obj = new a12();
	}
}

class a1
{
	a1()
	{
		System.out.println("Super Class");
	}
}

class a12 extends a1
{
	a12()
	{
		System.out.println("Child Class");
	}
}

