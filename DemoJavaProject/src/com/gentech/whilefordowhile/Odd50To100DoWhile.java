package com.gentech.whilefordowhile;

public class Odd50To100DoWhile {

	public static void main(String[] args) {
		int n = 50;
		int sum = 0;
		do{
			if(n%2!=0)
			{
				sum += n;
			}
			n++;
		}while(n<=100);
		System.out.print(sum);
	}

}
