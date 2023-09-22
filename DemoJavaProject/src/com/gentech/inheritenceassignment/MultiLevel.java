package com.gentech.inheritenceassignment;

public class MultiLevel {

	public static void main(String[] args) 
	{
		a43 obj = new a43();
	}

}
class a4
{
	a4()
	{
		System.out.println("Super Class");
	}
}

class a42 extends a4
{
	a42()
	{
		System.out.println("Child Class of parent class");
	}
}

class a43 extends a42
{
	a43()
	{
		System.out.println("Child Class of child class 1 ");
	}
}