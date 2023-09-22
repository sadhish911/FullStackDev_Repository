package com.gentech.programs;

public class Pattern2DemoDoWhile {

	public static void main(String[] args) {
		int i = 1;
		do{
			int k = 1;
			do{
				System.out.print(k+" ");
				k++;
			}while(k<=i);
			System.out.println("");
			i++;
		}while(i<=5);
	}

}
