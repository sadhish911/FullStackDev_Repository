package com.gentech.inheritenceassignment;

public class HybridInhertitance9 {

	public static void main(String[] args) {
		a93 obj = new a93("sadhish",24);
		System.out.println();
		System.out.println();
		a93 obj2 = new a93(560075);
		System.out.println();
		System.out.println();
		a94 obj3 = new a94("santosh",11);
		System.out.println();
		System.out.println();
		a94 obj4 = new a94(560038);
	}

}

class a9
{
	String names;
	int rollno;
	int colcode;
	a9(String name,int r)
	{
		names = name;
		rollno = r;
		
		System.out.println("Super Class name : "+names);
		System.out.println("Roll no : "+rollno);
	}
	a9(int cc)
	{
		colcode = cc;
		System.out.println("Super Class College Code : " + colcode);
	}
}

class a92 extends a9
{
	String names;
	int rollno;
	int colcode;
	a92(String name,int r)
	{
		super(name,r);
		names = name;
		rollno = r;
		System.out.println("Child Class 1 name : "+names);
		System.out.println("Roll no : "+rollno);
	}
	a92(int cc)
	{
		super(cc);
		colcode = cc;
		System.out.println("Child class 1 College Code : " + colcode);
	}
}

class a93 extends a92
{
	String names = "";
	int rollno;
	int colcode;
	a93(String name,int r)
	{
		super(name,r);
		names = name;
		rollno = r;
		System.out.println("Child Class 2 name : "+names);
		System.out.println("Roll no : "+rollno);
	}
	a93(int cc)
	{
		super(cc);
		colcode = cc;
		System.out.println("Child Class 2 College Code : " + colcode);
	}
}

class a94 extends a9
{
	String names = "";
	int rollno;
	int colcode;
	a94(String name,int r)
	{
		super(name,r);
		names = name;
		rollno = r;
		System.out.println("Child Class 2 name : "+names);
		System.out.println("Roll no : "+rollno);
	}
	a94(int cc)
	{
		super(cc);
		colcode = cc;
		System.out.println("Child Class 2 College Code : " + colcode);
	}
}