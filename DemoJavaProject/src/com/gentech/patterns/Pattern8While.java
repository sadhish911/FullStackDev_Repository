package com.gentech.patterns;

public class Pattern8While {

	public static void main(String[] args) {
		int i = 5;
		int c = 15;
		while(i>=1)
		{
			int k = 1;
			while(k<=i)
			{
				System.out.print(c+" ");
				c--;
				k++;
			}
			System.out.println("");
			i--;
		}
	}

}
