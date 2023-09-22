package com.gentech.programs;

public class EncapsulaltionSingleton {

	public static void main(String[] args) 
	{
		maths1 o = maths1.getInstance();
		o.addition(10, 5);
		o.mul(3, 6);
		
		maths1 o1 = maths1.getInstance();
		o1.addition(7, 5);
		o1.mul(9, 6);
		
		maths1 o2 = maths1.getInstance();
		o2.addition(2, 5);
		o2.mul(3, 2);
		
		if(o==o1 && o1==o2)
		{
			System.out.println("singleton");
		}
		else
		{
			System.out.println("not singleton");
		}
	}

}
class maths1
{
	static maths1 obj = null;
	private maths1()
	{
		
	}
	
	void addition(int x,int y)
	{
		int res = x+y;
		System.out.println("Add : "+res);
	}
	
	void mul(int x,int y)
	{
		int res = x*y;
		System.out.println("mul : "+res);
	}
	
	public static maths1 getInstance()
	{
		if(obj == null)
		{
			obj = new maths1();
		}
		return obj;
	}
}
