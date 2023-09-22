package com.gentech.inheritenceassignment;

public class MultiLevelSameMethod {

	public static void main(String[] args) {
		
		childclass2 obj = new childclass2("sadhish",12);
		obj.a1("Kumar",169);
	}
}
class assignment1
{
	void a1(String name,int r)
	{
		System.out.println("Super Class name : "+name);
		System.out.println("Roll no : "+r);
	}

}

class childclass1 extends assignment1
{
	childclass1(String name,int r)
	{
		super.a1(name,r);
	}
	void a1(String name,int r)
	{

		System.out.println("Child Class 1 name : "+name);
		System.out.println("Roll no : "+r);
	}
}

class childclass2 extends childclass1
{
	childclass2(String name,int r)
	{
		super(name,r);
		super.a1(name, r);
	}
	void a1(String name,int r)
	{
		
		System.out.println("Child Class 2 name : "+name);
		System.out.println("Roll no : "+r);
	}
}