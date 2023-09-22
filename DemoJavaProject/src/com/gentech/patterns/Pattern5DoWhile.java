package com.gentech.patterns;

public class Pattern5DoWhile {

	public static void main(String[] args) {
		int i = 1;
		int c = 1;
		do{
			int k = 1;
			do{
				System.out.print(c+" ");
				c++;
				k++;
			}while(k<=i);
			System.out.println("");
			i++;
		}while(i<=5);
	}

}
