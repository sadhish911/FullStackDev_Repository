package com.gentech.stringassignment;

public class Assignment5 {

	public static void main(String[] args) {

		String s = "dada";
		StringBuilder temp = new StringBuilder(s);
		String s1 = new String(temp.reverse());
		//StringBuilder s1 = new StringBuilder(s.reverse());
		if(s.equals(s1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
