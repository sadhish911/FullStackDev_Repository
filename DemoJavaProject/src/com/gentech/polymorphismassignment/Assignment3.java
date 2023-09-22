package com.gentech.polymorphismassignment;

public class Assignment3 {

	public static void main(String[] args) 
	{
		Details r = null;
		
		Development a = new Development();
		Qa m = new Qa();
		Sales o = new Sales();
		
		r = a;
		r.det();
		
		r=m;
		r.det();
		
		r=o;
		r.det();
	}
}
abstract class Details
{
	abstract void det();
}

class Development extends Details
{
	void det()
	{
		String name = "Development";
		int dep_code = 102;
		System.out.println("Department Name : "+name);
		System.out.println("Department Code : "+dep_code);
		System.out.println();
	}
}

class Qa extends Details
{
	void det()
	{
		String name = "Quality Assurance";
		int dep_code = 104;
		System.out.println("Department Name : "+name);
		System.out.println("Department Code : "+dep_code);
		System.out.println();
	}
}
class Sales extends Details
{
	void det()
	{
		String name = "Sales";
		int dep_code = 106;
		System.out.println("Department Name : "+name);
		System.out.println("Department Code : "+dep_code);
		System.out.println();
	}
}