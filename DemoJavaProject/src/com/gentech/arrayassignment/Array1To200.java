package com.gentech.arrayassignment;

public class Array1To200 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=200;i++)
		{
			if(i%3==0 && i%6==0 && i%9==0)
			{
			count++;
			}
		}
		int x[] = new int[count];
		int j = 0;
		for(int i = 1;i<=200;i++)
		{
			if(i%3==0 && i%6==0 && i%9==0)
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
