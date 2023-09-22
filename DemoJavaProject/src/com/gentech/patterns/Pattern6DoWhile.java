package com.gentech.patterns;

public class Pattern6DoWhile {

	public static void main(String[] args) {
		int i = 1;
		int c = 5;
		do{
			int k = 1;
			do{
				System.out.print(c+" ");
				c+=5;
				k++;
			}while(k<=i);
			System.out.println("");
			i++;
		}while(i<=5);
	}

}
