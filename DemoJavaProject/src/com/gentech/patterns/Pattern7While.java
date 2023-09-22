package com.gentech.patterns;

public class Pattern7While {

	public static void main(String[] args) {
		int i = 1;
		int c = 1;
		while(i<=4)
		{
			int k = 1;
			while(k<=i)
			{
				System.out.print(c*c+" ");
				c++;
				k++;
			}
			System.out.println("");
			i++;
		}
	}

}
