package com.gentech.polymorphismassignment;

public class Assignment1 {

	public static void main(String[] args) 
	{
		result r = null;
		
		add a = new add();
		mul m = new mul();
		min o = new min();
		
		r = a;
		r.res(10, 5);
		
		r=m;
		r.res(12, 2);
		
		r=o;
		r.res(50, 20);
	}
}
abstract class result
{
	abstract void res(int a,int b);
}

class add extends result
{
	void res(int a,int b)
	{
		System.out.println("Addition : "+(a+b));
	}
}

class mul extends result
{
	void res(int a,int b)
	{
		System.out.println("Multiplication : "+(a*b));
	}
}
class min extends result
{
	void res(int a,int b)
	{
		System.out.println("Mnus : "+(a-b));
	}
}