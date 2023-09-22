package com.gentech.whilefordowhile;

public class Odd50To100For {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 50;i<=100;i++)
		{
			if(i%2!=0)
			{
				sum += i;
			}
		}
		System.out.print(sum);
	}

}
