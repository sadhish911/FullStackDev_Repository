package com.gentech.fileassignment;

import java.io.File;

public class Assignment3 {

	public static void main(String[] args) {

		a1();
	}
	static void a1()
	{
		String s = "W:\\Gentech\\FileDemo\\Nested";
		for(int i=0;i<5;i++)
		{
			s=s+"\\dir"+i;
			File f1 = new File(s);
			System.out.println(f1.mkdir());
		}
	}
}
