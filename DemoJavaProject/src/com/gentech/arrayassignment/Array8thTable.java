package com.gentech.arrayassignment;

public class Array8thTable {

	public static void main(String[] args) {
		int x[] = new int[10];
		int j = 0;
		for(int i = 8;i<=80;i++)
		{
			if(i%8==0)
			{
				x[j] = i;
				j++;
			}
		}
		for(int k=0;k<x.length/2;k++)
		{
			System.out.println(x[k]);
		}
	}

}

