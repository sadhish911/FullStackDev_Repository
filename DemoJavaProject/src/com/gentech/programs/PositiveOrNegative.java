package com.gentech.programs;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if(n>0)
		{
			System.out.println(n+" is an positive nnumber");
		}
		else if(n<0)
		{
			System.out.println(n+" is an negative nnumber");

		}
		else 
		{
			System.out.println("It is zero");
		}
	}

}
