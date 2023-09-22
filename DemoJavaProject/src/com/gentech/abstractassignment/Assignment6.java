package com.gentech.abstractassignment;

public class Assignment6 {

	public static void main(String[] args) {

		HL2 obj = new HL2();
		obj.method1();
		obj.method2();
		System.out.println();
		HL3 obj2 = new HL3();
		obj2.method1();
		obj2.method2();
		
	}

}
abstract class HybridLevel
{
	abstract void method1();
	abstract void method2();
}

abstract class HL1 extends HybridLevel
{

	void method1()
	{
		System.out.println("Method 1 from Child class of Super class");
	}
	abstract void method2();
}

class HL2 extends HL1
{
	void method2()
	{
		System.out.println("Method 2 from Sub Class");
	}
}

class HL3 extends HybridLevel
{


	void method1()
	{
		System.out.println("Method 1 from Simple Inheritance of Super class");
	}
	void method2()
	{
		System.out.println("Method 2 from Simple Inheritance of Super class");
	}
}