package com.gentech.whilefordowhile;

public class Square20To1While {

	public static void main(String[] args) {
		int n = 20;
		int sum = 0;
		while(n>=1)
		{
			int s = n*n;
			sum += s;
			n--;
		}
		System.out.print(sum);
	}

}
