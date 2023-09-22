package com.gentech.constructoractivities;

public class AlphabetConstructor {

	public static void main(String[] args) {
		alphabet obj = new alphabet('%');
		alphabet obj2 = new alphabet('P');
	}

}

class alphabet
{
	alphabet(char ch)
	{
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
		{
			System.out.println("It is Alphabet");
		}
		else
		{
			System.out.println("It is not a Alphabet");
		}
	}
	alphabet()
	{
		
	}
	
}