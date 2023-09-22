package com.gentech.programs;

public class Pattern2DemoWhile {

	public static void main(String[] args) {
		int i = 1;
		while(i<=5)
		{
			int k = 1;
			while(k<=i)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println("");
			i++;
		}
	}

}
