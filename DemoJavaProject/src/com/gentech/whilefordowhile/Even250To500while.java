package com.gentech.whilefordowhile;

public class Even250To500while {

	public static void main(String[] args) {
		int n = 250;
		int sum = 0;
		while(n<=500)
		{
			if(n%2==0)
			{
				sum += n;
			}
			n++;
		}
		System.out.print(sum);
	}

}
