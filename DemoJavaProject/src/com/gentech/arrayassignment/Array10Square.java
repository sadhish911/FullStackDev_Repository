package com.gentech.arrayassignment;

public class Array10Square {

	public static void main(String[] args) {
		int x[] = new int[10];
		int j = 0;
		for(int i = 10;i>=1;i--)
		{
				x[j] = i*i;
				j++;
		}
		for(int k=x.length/2;k<x.length;k++)
		{
			System.out.println(x[k]);
		}
	}

}
