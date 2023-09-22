package com.gentech.constructoractivities;

public class FindConstructor {

	public static void main(String[] args) {
		find obj = new find(1245678);
	}

}

class find
{
	int c = 0;
	int temp = 0;
	find(int n)
	{
		temp = n;
		c = n%10;
		while(c>0)
		{
			if((temp%10) == c)
			{
				temp = temp/10;
				c--;
			}
			else
			{
				System.out.print("Missing : "+c);
				break;
			}
		}
	}
}
