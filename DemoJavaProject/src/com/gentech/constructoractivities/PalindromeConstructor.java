package com.gentech.constructoractivities;

public class PalindromeConstructor {

	public static void main(String[] args) 
	{
		palindrome obj = new palindrome(51215);
	}

}

class palindrome
{
	palindrome(int n)
	{
		int temp = n;
		int n1 = 0;
		while(temp>0)
		{
			n1 = n1*10 + (temp%10);
			temp = temp/10;
		}
		
		if(n1 == n)
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}
}
