package com.gentech.inheritenceassignment;

public class HierarchialInheritance {

	public static void main(String[] args) {
		a22 obj = new a22();
		a23 obj2 = new a23();
		a24 obj3 = new a24();
	}
}
class a2
{
	a2()
	{
		System.out.println("Super Class");
	}
}

class a22 extends a2
{
	a22()
	{
		System.out.println("Child Class 1");
	}
}

class a23 extends a2
{
	a23()
	{
		System.out.println("Child Class 2");
	}
}
class a24 extends a2
{
	a24()
	{
		System.out.println("Child Class 3");
	}
}
