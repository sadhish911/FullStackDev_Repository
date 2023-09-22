package com.gentech.whilefordowhile;

public class Divisible100To200While {

	public static void main(String[] args) {
		int n = 100;
		while(n<=200)
		{
			if(n%4==0)
			{
				System.out.println(n);
			}
			n++;
		}
	}

}
