package com.gentech.abstractassignment;

public class Assignment2 {

	public static void main(String[] args) {
		Abstatic1 obj = new Abstatic1();
	}

}

abstract class AbstractStatic
{
	static
	{
		System.out.println("Static Block From Abstract Class");
	}
}

class Abstatic1 extends AbstractStatic
{
	
}

