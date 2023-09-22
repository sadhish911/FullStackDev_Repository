package com.gentech.constructoroverloading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d obj = new d();
		obj.d(2);
	}

}

class d
{
	void d(int n)
	{
		System.out.println(n);
	}
}
