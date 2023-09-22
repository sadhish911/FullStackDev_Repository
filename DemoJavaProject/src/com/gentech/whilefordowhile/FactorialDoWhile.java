package com.gentech.whilefordowhile;

public class FactorialDoWhile {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int c = 1;
		int f = 1;
		do{
			f = f * c;
			c++;
		}while(c<=n);
		System.out.print(f);
	}

}
