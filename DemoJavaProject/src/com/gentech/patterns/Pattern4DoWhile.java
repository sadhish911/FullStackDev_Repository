package com.gentech.patterns;

public class Pattern4DoWhile {

	public static void main(String[] args) {
		int i = 1;
		do{
			int k = 1;
			do{
				System.out.print(i+" ");
				k++;
			}while(k<=i);
			System.out.println("");
			i++;
		}while(i<=5);
	}

}
