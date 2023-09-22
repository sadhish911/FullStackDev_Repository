package com.gentech.polymorphismassignment;

public class Assignment2 {

	public static void main(String[] args) 
	{
		parameter r = null;
		
		sq a = new sq();
		cir m = new cir();
		rec o = new rec();
		
		r = a;
		r.para();
		
		r=m;
		r.para();
		
		r=o;
		r.para();
	}

}
abstract class parameter
{
	abstract void para();
}

class sq extends parameter
{
	void para()
	{
		int side  = 5;
		int res = side*4;
		System.out.println("Square parameter : "+res);
	}
}

class cir extends parameter
{
	void para()
	{
		int radius  = 5;
		double res = 2*3.14*(radius*radius);
		System.out.println("Circle parameter : "+res);
	}
}
class rec extends parameter
{
	void para()
	{
		int l  = 5;
		int b = 3;
		double res = 2*l + 2*b;
		System.out.println("Rectangle parameter : "+res);
	}
}