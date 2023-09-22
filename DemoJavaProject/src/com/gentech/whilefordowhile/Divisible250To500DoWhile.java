package com.gentech.whilefordowhile;

public class Divisible250To500DoWhile {

	public static void main(String[] args) {
		int n = 250;
		int c = 0;
		do{
			if(n%10==0)
			{
				c++;
			}
			n++;
		}while(n<=500);
		System.out.print(c);
	}

}
