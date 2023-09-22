package com.gentech.inheritenceassignment;

public class MulltiLevel5 {

	public static void main(String[] args) {
		a53 obj = new a53("sadhish");
	}

}
class a5
{
	a5(String name)
	{
		System.out.println("Super Class name : "+name);
	}
}

class a52 extends a5
{
	a52(String name)
	{
		super(name);
		System.out.println("Child Class of parent class");
	}
}

class a53 extends a52
{
	a53(String name)
	{
		super(name);
		System.out.println("Child Class of child class 1 ");
	}
}