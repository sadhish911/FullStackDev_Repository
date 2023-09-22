package com.gentech.arrayassignment;

public class Even60to80array {

	public static void main(String[] args) {
		int count=0;
		for(int i=60;i<=80;i++)
		{
			if(i%2==0)
			{
			count++;
			}
		}
		int x[] = new int[count];
		int j = 0;
		for(int i = 60;i<=80;i++)
		{
			if(i%2==0)
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
