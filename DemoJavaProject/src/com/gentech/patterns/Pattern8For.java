package com.gentech.patterns;

public class Pattern8For {

	public static void main(String[] args) {
		int c = 15;
		for(int i = 5;i>=1;i--)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(c+" ");
				c--;
			}
			System.out.println("");
		}
	}

}
