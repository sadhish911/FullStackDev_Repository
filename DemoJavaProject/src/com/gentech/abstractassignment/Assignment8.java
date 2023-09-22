package com.gentech.abstractassignment;

public class Assignment8 {

	public static void main(String[] args) {
		LevelOverload2 obj = new LevelOverload2("Sadhish");
		LevelOverload2 obj2 = new LevelOverload2(24);
	}

}
abstract class MultiLevelOverloading
{
	MultiLevelOverloading(String name) 
	{
		System.out.println("The name in super class is : "+name);
	}
	MultiLevelOverloading(int n)
	{
		System.out.println("The Roll no in super class is : "+n);
	}
}

class LevelOverload1 extends MultiLevelOverloading
{
	LevelOverload1(String name) {
		super(name);
	}
	LevelOverload1(int n)
	{
		super(n);
	}
	void method1()
	{
		System.out.println("Method 1 from Child class of Super class");
	}
  }

class LevelOverload2 extends LevelOverload1
{
	LevelOverload2(String name){
		super(name);
	}

	LevelOverload2(int n){
		super(n);
	}
}