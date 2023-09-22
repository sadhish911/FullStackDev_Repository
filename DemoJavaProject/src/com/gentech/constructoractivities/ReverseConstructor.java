package com.gentech.constructoractivities;

public class ReverseConstructor {

	public static void main(String[] args) {
		reverse obj  =new reverse(123);
	}

}
class reverse
{
	int d = 0;
	int c=0;
	reverse(int n)
	{
		d = n;
		while(d>0)
		{
			c = c*10 + (d%10);
			d = d/10;
			
		}
		System.out.println("Reverse : " +c);
	}
}
