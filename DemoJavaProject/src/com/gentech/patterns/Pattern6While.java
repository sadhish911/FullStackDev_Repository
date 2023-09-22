package com.gentech.patterns;

public class Pattern6While {

	public static void main(String[] args) {
		int i = 1;
		int c = 5;
		while(i<=5)
		{
			int k = 1;
			while(k<=i)
			{
				System.out.print(c+" ");
				c+=5;
				k++;
			}
			System.out.println("");
			i++;
		}
	}

}
