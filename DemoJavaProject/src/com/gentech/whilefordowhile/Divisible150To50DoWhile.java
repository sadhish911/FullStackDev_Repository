package com.gentech.whilefordowhile;

public class Divisible150To50DoWhile {

	public static void main(String[] args) {
		int n = 150;
		do{
			if(n%6==0)
			{
				System.out.println(n);
			}
			n--;
		}while(n>=50);
	}

}
