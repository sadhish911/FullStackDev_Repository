package com.gentech.patterns;

public class Pattern5For {

	public static void main(String[] args) {
		int c = 1;
		for(int i = 1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println("");
		}
	}

}
