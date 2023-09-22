package com.gentech.whilefordowhile;

public class Odd50To100while {

	public static void main(String[] args) {
		int n = 50;
		int sum = 0;
		while(n<=100)
		{
			if(n%2!=0)
			{
				sum += n;
			}
			n++;
		}
		System.out.print(sum);
	}

}
