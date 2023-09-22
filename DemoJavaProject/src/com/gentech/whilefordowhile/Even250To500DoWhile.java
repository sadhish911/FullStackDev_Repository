package com.gentech.whilefordowhile;

public class Even250To500DoWhile {

	public static void main(String[] args) {
		int n = 250;
		int sum = 0;
		do{
			if(n%2==0)
			{
				sum += n;
			}
			n++;
		}while(n<=500);
		System.out.print(sum);
	}

}
