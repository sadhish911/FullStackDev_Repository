package com.gentech.whilefordowhile;

public class Square20To1For {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 20;i>=1;i--)
		{
			int s = i*i;
			sum += s;
		}
		System.out.print(sum);
	}

}
