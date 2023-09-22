package com.gentech.arrayassignment;

public class Array100to50Reverse {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i>=50;i--)
		{
			if(i%4==0)
			{
			count++;
			}
		}
		int x[] = new int[count];
		int j = 0;
		for(int i = 100;i>=50;i--)
		{
			if(i%4==0)
			{
				x[j] = i;
				j++;
			}
		}
		for(int k=x.length-1;k>=0;k--)
		{
			System.out.println(x[k]);
		}
	}

}
