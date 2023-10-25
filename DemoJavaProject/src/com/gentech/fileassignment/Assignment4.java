package com.gentech.fileassignment;

import java.io.File;

public class Assignment4 {
                                                                         
	public static void main(String[] args) {
		String s = "W:\\Gentech\\FileDemo";
		a1(s);
	}
	static void a1(String path)
	{
		File f1 = new File(path);
		File f2[] = f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			
			if(f2[i].isDirectory()==true)
			{
				System.out.println(f2[i].getPath());
				a1(f2[i].getPath());
			}
		}
	}
}
