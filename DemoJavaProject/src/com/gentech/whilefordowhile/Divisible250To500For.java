package com.gentech.whilefordowhile;

public class Divisible250To500For {

	public static void main(String[] args) {
		int c = 0;
		for(int i = 250;i<=500;i++)
		{
			if(i%10==0)
			{
				c++;
			}
		}
		System.out.print(c);
	}

}
