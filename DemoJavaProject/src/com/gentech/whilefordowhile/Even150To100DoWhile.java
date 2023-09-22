package com.gentech.whilefordowhile;

public class Even150To100DoWhile {

	public static void main(String[] args) {
		int n = 150;
		do{
			if(n%2==0)
			{
				System.out.println(n);
			}
			n--;
		}while(n>=100);
		

	}

}
