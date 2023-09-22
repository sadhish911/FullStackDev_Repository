package com.gentech.patterns;

public class Pattern5While {

	public static void main(String[] args) {
		int i = 1;
		int c = 1;
		while(i<=5)
		{
			int k = 1;
			while(k<=i)
			{
				System.out.print(c+" ");
				c++;
				k++;
			}
			System.out.println("");
			i++;
		}
	}

}
