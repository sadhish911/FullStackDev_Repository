package com.gentech.arrayassignment;

public class Array2DReverse {

	public static void main(String[] args) {
		String s[][] = {{"abc","acb","bac"},{"xyz","yxz","xzy"},{"ijk","kji","jki"}};
		
		for(int i = 2; i>=0 ;i--)
		{
			for(int j =  2;j >= 0;j--)
			{
				String res = s[i][j];
				System.out.print(res+" ");
			}
			System.out.println("");
		}
	}

}
