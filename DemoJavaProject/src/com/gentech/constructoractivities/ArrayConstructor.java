package com.gentech.constructoractivities;

import java.util.Arrays;

public class ArrayConstructor {

	public static void main(String[] args) {
		int n[] = {5,7,6,1,2,3,9};
		sort obj = new sort(n);
	}

}
class sort
{
	sort(int a[])
	{
		int tmp[] = a;
		Arrays.sort(tmp);
//		int tmp = 0;
//		for(int i = 0;i<a.length;i++)
//		{
//			
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i] < a[j]);
//				{
//					tmp = a[j];
//					a[j] = a[i];
//					a[i] = tmp;
//				}
//			}
//		}
		
		for(int i = 0;i<tmp.length;i++)
		{
			System.out.print(tmp[i]+ " ");
		}
	}
}