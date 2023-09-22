package com.gentech.arrayassignment;

public class Array2DChar1stCol {

	public static void main(String[] args) {
		char ch[][] = {{'a','b','c'},{'x','y','z'},{'i','j','k'}};
		
		for(int i = 0;i < ch.length ; i++)
		{
			System.out.println(ch[i][0]);
		}
	}

}
