package com.gentech.arrayassignment;

public class Array2DByte {

	public static void main(String[] args) {
		byte b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int i = 0;
		
		while(i<b.length)
		{
			int j = 0;
			while(j<b[i].length)
			{
				System.out.print(b[i][j]+" ");
				j++;
			}
			System.out.println("");
			i++;
		}

	}

}
