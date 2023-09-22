package com.gentech.whilefordowhile;

public class FactorialWhile {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int c = 1;
		int f = 1;
		while(c<=n)
		{
			f = f * c;
			c++;
		}
		System.out.print(f);
	}

}
