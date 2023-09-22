package com.gentech.inheritenceassignment;

public class MultiLevel6 {

	public static void main(String[] args) {
		a63 obj = new a63("sadhish",24,560075);
	}

}
class a6
{
	String names;
	int rollno;
	int colcode;
	a6(String name,int r,int cc)
	{
		names = name;
		rollno = r;
		colcode = cc;
		System.out.println("Super Class name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " + colcode);
	}
}

class a62 extends a6
{
	String names;
	int rollno;
	int colcode;
	a62(String name,int r,int cc)
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

class a63 extends a62
{
	String names = "";
	int rollno;
	int colcode;
	a63(String name,int r,int cc)
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