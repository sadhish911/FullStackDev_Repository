package com.gentech.inheritenceassignment;

public class MultiLevelSameVariable {

	public static void main(String[] args) {
		childclass2 obj = new childclass2("sadhish",12);
		obj.a1("Kumar",169);
	}
}
class assignment2
{
	String names;
	int rollno;
	void a1(String name,int r)
	{
		names = name;
		rollno = r;
		System.out.println("Super Class name : "+names);
		System.out.println("Roll no : "+rollno);
	}

}

class childclass21 extends assignment2
{
	String names;
	int rollno;
	childclass21(String name,int r)
	{
		super.a1(name,r);
		names = name;
		rollno = r;
		
	}
	void a1()
	{

		System.out.println("Child Class 1 name : "+names);
		System.out.println("Roll no : "+rollno);
	}
}

class childclass22 extends childclass21
{
	String names;
	int rollno;
	childclass22(String name,int r)
	{
		super(name,r);
		super.a1();
		names = name;
		rollno = r;
	}
	void a1()
	{
		System.out.println("Child Class 2 name : "+names);
		System.out.println("Roll no : "+rollno);
	}
}