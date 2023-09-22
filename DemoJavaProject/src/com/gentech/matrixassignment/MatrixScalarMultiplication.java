package com.gentech.matrixassignment;

import java.util.Scanner;

public class MatrixScalarMultiplication {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value to multiply");
		int x = sc.nextInt();
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j] = a[i][j]*x;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		sc.close();
		
	}

}
