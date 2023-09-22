package com.gentech.abstractassignment;

public class Assignment3 {

	public static void main(String[] args) {

		a3 obj = new a3();
	}
}

abstract class AbstractNoArgs
{
	AbstractNoArgs()
	{
		System.out.println("No Argument Constructor Block From Abstract Class");
	}
}
class a3 extends AbstractNoArgs
{
	
}
