package com.gentech.fileassignment;

import java.io.File;

public class Assignment1 {

	public static void main(String[] args) 
	{
		a1();
	}
	
	static void a1()
	{
		for(int i=0;i<10;i++)
		{
			File f1 = new File("W:\\Gentech\\FileDemo\\Assignment1\\folder"+i);
			f1.mkdir();
		}
	}
}
