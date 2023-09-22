package com.gentech.patterns;

public class Pattern7For {

	public static void main(String[] args) {
		int c = 1;
		for(int i = 1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(c*c+" ");
				c++;
			}
			System.out.println("");
		}
	}

}
