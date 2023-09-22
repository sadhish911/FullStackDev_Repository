package com.gentech.abstractassignment;

public class Assignment7 {

	public static void main(String[] args) {

		Level2 obj = new Level2("Sadhish");
		obj.method1();
	}

}
abstract class MultiLevelParametrized
{
	MultiLevelParametrized(String name) 
	{
		System.out.println("The name in super class is : "+name);
	}
}

class Level1 extends MultiLevelParametrized
{
	Level1(String name) {
		super(name);
	}
	void method1()
	{
		System.out.println("Method 1 from Child class of Super class");
	}
  }

class Level2 extends Level1
{
	Level2(String name){
		super(name);
	}
}
