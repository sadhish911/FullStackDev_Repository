package com.gentech.constructoractivities;

public class VowelConstructor {

	public static void main(String[] args) {

		vowel obj = new vowel('A');
		vowel obj2 = new vowel('z');

	}

}
class vowel
{
	vowel(char ch)
	{
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
		{
			System.out.println("It is Vowel");
		}
		else
		{
			System.out.println("It is not a vowel");
		}
	}
	
}
