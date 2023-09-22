package com.gentech.inheritenceassignment;

public class MultiLevel7 {

	public static void main(String[] args) 
	{
		a73 obj = new a73("Sadhish",24);
		a73 obj2 = new a73(560075);
		
	}

}
class a7
{
	String names;
	int rollno;
	int colcode;
	a7(String name,int r)
	{
		names = name;
		rollno = r;
		
		System.out.println("Super Class name : "+names);
		System.out.println("Roll no : "+rollno);
	}
	a7(int cc)
	{
		colcode = cc;
		System.out.println("Super Class College Code : " + colcode);
	}
}

class a72 extends a7
{
	String names;
	int rollno;
	int colcode;
	a72(String name,int r)
	{
		super(name,r);
		names = name;
		rollno = r;
		System.out.println("Child Class 1 name : "+names);
		System.out.println("Roll no : "+rollno);
	}
	a72(int cc)
	{
		super(cc);
		colcode = cc;
		System.out.println("Child class 1 College Code : " + colcode);
	}
}

class a73 extends a72
{
	String names = "";
	int rollno;
	int colcode;
	a73(String name,int r)
	{
		super(name,r);
		names = name;
		rollno = r;
		System.out.println("Child Class 2 name : "+names);
		System.out.println("Roll no : "+rollno);
	}
	a73(int cc)
	{
		super(cc);
		colcode = cc;
		System.out.println("Child Class 2 College Code : " + colcode);
	}
}