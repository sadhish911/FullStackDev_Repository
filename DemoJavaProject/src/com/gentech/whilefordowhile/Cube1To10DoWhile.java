package com.gentech.whilefordowhile;

public class Cube1To10DoWhile {

	public static void main(String[] args) {
		int n = 1;
		do{
			int s = n*n*n;
			System.out.println(s);
			n++;
		}while(n<=10);
		
	}

}
