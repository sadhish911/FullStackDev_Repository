package com.gentech.whilefordowhile;

public class Square20To1DoWhile {

	public static void main(String[] args) {
		int n = 20;
		int sum = 0;
		do{
			int s = n*n;
			sum += s;
			n--;
		}while(n>=1);
		System.out.print(sum);
	}

}
