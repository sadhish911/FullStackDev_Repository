package com.gentech.fileassignment;

import java.io.File;

public class Assignment2 {

	public static void main(String[] args) 
	{
		a1();
	}
	static void a1()
	{
		String s1[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String s = "W:\\Gentech\\FileDemo\\weekday\\";
		
		for(String s2 : s1)
		{
			File f1 = new File(s+s2);
			System.out.println(f1.mkdir());
		}
	}
}
