package com.gentech.whilefordowhile;

public class FactorialFor {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int f = 1;
		for(int i=1;i<=n;i++)
		{
			f = f * i;
		}
		System.out.print(f);

	}

}
