package com.gentech.constructoractivities;

public class SumConstructor {

	public static void main(String[] args) {
		sum obj = new sum(541);
	}

}
class sum
{
	int d = 0;
	int c=0;
	sum(int n)
	{
		d = n;
		while(d>0)
		{
			c = c + (d%10);
			d = d/10;
			
		}
		System.out.println("Sum : " +c);
	}
}