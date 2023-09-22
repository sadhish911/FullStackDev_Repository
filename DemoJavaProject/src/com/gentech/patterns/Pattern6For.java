package com.gentech.patterns;

public class Pattern6For {

	public static void main(String[] args) {
		int c = 5;
		for(int i = 1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(c+" ");
				c+=5;;
			}
			System.out.println("");
		}
	}

}
