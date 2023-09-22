package com.gentech.abstractassignment;

public class Assignment5 {

	public static void main(String[] args) {

		Cl3 obj = new Cl3();
		obj.method1();
		obj.method2();
		
	}

}
abstract class MultiLevel
{
	abstract void method1();
	abstract void method2();
}

abstract class Cl2 extends MultiLevel
{

	void method1()
	{
		System.out.println("Method 1 from Child class of Super class");
	}
	abstract void method2();
}

class Cl3 extends Cl2
{
	void method2()
	{
		System.out.println("Method 2 from Sub Class");
	}
}