package com.gentech.arrayassignment;

public class Array150to200 {

	public static void main(String[] args) {
		int count=0;
		for(int i=150;i<=200;i++)
		{
			if(i%6==0)
			{
			count++;
			}
		}
		int x[] = new int[count];
		int j = 0;
		for(int i = 150;i<=200;i++)
		{
			if(i%6==0)
			{
				x[j] = i;
				j++;
			}
		}
		for(int k=x.length/2;k<x.length;k++)
		{
			System.out.println(x[k]);
		}
	}

}
