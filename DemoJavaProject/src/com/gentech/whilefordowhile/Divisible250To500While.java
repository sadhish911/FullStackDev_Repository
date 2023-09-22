package com.gentech.whilefordowhile;

public class Divisible250To500While {

	public static void main(String[] args) {
		int n = 250;
		int c = 0;
		while(n<=500)
		{
			if(n%10==0)
			{
				c++;;
			}
			n++;
		}
		System.out.print(c);
	}

}
