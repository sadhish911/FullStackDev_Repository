package com.gentech.inheritenceassignment;

public class MultiLevelSameMethodVariable {

	public static void main(String[] args) {
		childclass32 obj = new childclass32("sadhish",12,560075);
		obj.a1();
		obj.method2();
	}

}
class assignment3
{
	String names;
	int rollno;
	int colcode;
	void a1()
	{
		System.out.println("Super Class name : "+names);
		System.out.println("Roll no : "+rollno);
	}
	void method2()
	{
		System.out.println("Super Class college code : "+colcode);
	}

}

class childclass31 extends assignment3
{
	String names;
	int rollno;
	int colcode;
	childclass31(String name,int r,int cc)
	{
		super.names=name;
		super.rollno = r;
		super.colcode = cc;
		super.method2();
		names = name;
		rollno = r;
		colcode = cc;
		
	}
	void a1()
	{
		System.out.println("Child Class 1 name : "+names);
		System.out.println("Roll no : "+rollno);
	}
	void method2()
	{
		System.out.println("Child Class 1 college code : "+colcode);
	}
}

class childclass32 extends childclass31
{
	String names;
	int rollno;
	int colcode;
	childclass32(String name,int r,int cc)
	{
		super(name,r,cc);
		super.a1();
		super.method2();
		names = name;
		rollno = r;
		colcode = cc;
	}
	void a1()
	{
		System.out.println("Child Class 2 name : "+names);
		System.out.println("Roll no : "+rollno);
	}
	void method2()
	{
		System.out.println("Child Class 2 college code : "+colcode);
	}
}