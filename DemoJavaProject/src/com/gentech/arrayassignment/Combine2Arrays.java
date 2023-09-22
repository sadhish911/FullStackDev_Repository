package com.gentech.arrayassignment;

public class Combine2Arrays {

	public static void main(String[] args) {
		int a[] = {2,4,6,8};
		int b[] = {10,20,30,40,50,60};
		
		int result[] = new int[a.length + b.length];
		int j = 0;
		for(int i=0;i< a.length;i++)
		{
			result[j] = a[i];
			j++;
		}
		for(int i=0;i< b.length;i++)
		{
			result[j] = b[i];
			j++;
		}
		
		for(int i=0;i< result.length;i++)
		{
			System.out.println(result[i]);
		}
	}

} 
