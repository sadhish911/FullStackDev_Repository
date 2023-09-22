package com.gentech.whilefordowhile;

public class Divisible150To50While {

	public static void main(String[] args) {
		int n = 150;
		while(n>=50)
		{
			if(n%6==0)
			{
				System.out.println(n);
			}
			n--;
		}
	}

}
