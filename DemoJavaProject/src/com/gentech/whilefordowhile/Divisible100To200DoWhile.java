package com.gentech.whilefordowhile;

public class Divisible100To200DoWhile {

	public static void main(String[] args) {
		int n = 100;
		do{
			if(n%4==0)
			{
				System.out.println(n);
			}
			n++;
		}while(n<=200);
	}

}
