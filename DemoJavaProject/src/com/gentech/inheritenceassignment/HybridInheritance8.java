package com.gentech.inheritenceassignment;

public class HybridInheritance8 {

	public static void main(String[] args) {
		a83 obj = new a83("sadhish",24,560075);
		System.out.println();
		System.out.println();
		a84 obj2 = new a84("santosh",11,560038);
	}
}
class a8
{
	String names;
	int rollno;
	int colcode;
	a8(String name,int r,int cc)
	{
		names = name;
		rollno = r;
		colcode = cc;
		System.out.println("Super Class name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " + colcode);
	}
}

class a82 extends a8
{
	String names;
	int rollno;
	int colcode;
	a82(String name,int r,int cc)
	{
		super(name,r,cc);
		names = name;
		rollno = r;
		colcode = cc;
		System.out.println("Child Class 1 name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " + colcode);
	}
}

class a83 extends a82
{
	String names = "";
	int rollno;
	int colcode;
	a83(String name,int r,int cc)
	{
		super(name,r,cc);
		names = name;
		rollno = r;
		colcode = cc;
		System.out.println("Child Class 2 name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " + colcode);
	}
}

class a84 extends a8
{
	String names = "";
	int rollno;
	int colcode;
	a84(String name,int r,int cc)
	{
		super(name,r,cc);
		names = name;
		rollno = r;
		colcode = cc;
		System.out.println("Child Class 3(simple) name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " + colcode);
	}
}