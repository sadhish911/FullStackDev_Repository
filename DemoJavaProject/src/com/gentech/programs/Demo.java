package com.gentech.programs;

public class Demo 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Java");
		demoo o = new demoo();
		o.a("sadhish");
	}
}
interface a1
{
	default void a(String s)
	{
		System.out.println("a1 : "+s);
	}
}
interface a2
{
	default void a(String s)
	{
		System.out.println("a2 : "+s);
	}
}

class demoo implements a1,a2
{

	@Override
	public void a(String s) {
		// TODO Auto-generated method stub
		a2.super.a(s);
	}
	
}