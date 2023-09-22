package com.gentech.inheritenceassignment;

public class HybridInheritance {

	public static void main(String[] args) {
		a33 obj = new a33();
		a34 obj2 = new a34();
	}

}
class a3
{
	a3()
	{
		System.out.println("Super Class");
	}
}

class a32 extends a3
{
	a32()
	{
		System.out.println("Child Class 1");
	}
}

class a33 extends a32
{
	a33()
	{
		System.out.println("Child Class 2");
	}
}
class a34 extends a3
{
	a34()
	{
		System.out.println("Child Class of parent class");
	}
}