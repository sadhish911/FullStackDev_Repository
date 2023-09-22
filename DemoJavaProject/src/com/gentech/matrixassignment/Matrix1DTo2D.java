package com.gentech.matrixassignment;

public class Matrix1DTo2D {

	public static void main(String[] args) {
		int x[] = {1,2,3,4,5,6};
		int result[][] = new int[2][3];
		int k = 0;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				result[i][j] = x[k];
				k++;
			}
		}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
