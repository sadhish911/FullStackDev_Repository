package com.gentech.matrixassignment;

public class Matrix2DTo1D {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int result[] = new int[9];
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				result[k] = a[i][j];
				k++;
			}
		}
		
		for(int j=0;j<9;j++)
		{
			System.out.print(result[j]+" ");
		}
	}

}
