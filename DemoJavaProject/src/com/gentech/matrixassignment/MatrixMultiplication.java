package com.gentech.matrixassignment;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{1,7},{3,2},{5,1}};
		
		int result[][] = new int[a.length][b[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				int temp = 0;
				for(int k=0;k<b.length;k++)
				{
					temp = temp + (a[i][k] * b[k][j]);
				}
				result[i][j] = temp;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
