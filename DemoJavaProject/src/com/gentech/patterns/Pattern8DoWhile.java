package com.gentech.patterns;

public class Pattern8DoWhile {

	public static void main(String[] args) {
		int i = 5;
		int c = 15;
		do{
			int k = 1;
			do{
				System.out.print(c+" ");
				c--;
				k++;
			}while(k<=i);
			System.out.println("");
			i--;
		}while(i>=1);
	}

}
