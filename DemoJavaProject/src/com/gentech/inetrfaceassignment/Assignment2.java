package com.gentech.inetrfaceassignment;

public class Assignment2
{

	public static void main(String[] args) 
	{
		addition o = new addition();
		o.add3();
	}
}

interface add
{
	public static final int a = 250;
	public static final int b = 100;
	public static final int c = 50;
	void add3();
}

class addition implements add
{
	public void add3()
	{
		System.out.println("Addition of a ,b ,c : " + a+b+c);
	}
}