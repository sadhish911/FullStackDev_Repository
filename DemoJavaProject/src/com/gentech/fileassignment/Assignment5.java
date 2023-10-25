package com.gentech.fileassignment;

import java.io.File;

public class Assignment5 {

	public static void main(String[] args) 
	{
		//a1();
		//a2();
		a3();
	}
	static void a1()
	{
		File f = new File("W:\\Gentech\\FileDemo\\Assignment5");
		File f1[] = f.listFiles();
		for(File f2 : f1)
		{
			String fileName = f2.getName();
			int index = fileName.lastIndexOf('.');
			String ext = fileName.substring(index+1);
			if(ext.equals("xlsx"))
			{
				System.out.println(f2.getAbsolutePath());
			}
		}
	}
	
	static void a2()
	{
		File f = new File("W:\\Gentech\\FileDemo\\Assignment5");
		File f1[] = f.listFiles();
		int c = 0;
		for(File f2 : f1)
		{
			String fileName = f2.getName();
			int index = fileName.lastIndexOf('.');
			String ext = fileName.substring(index+1);
			if(ext.equals("docx"))
			{
				String s = "W:\\Gentech\\FileDemo\\Assignment5\\Document"+c+".docx";
				File temp = new File(s);
				f2.renameTo(temp);
				c++;
				System.out.println(f2.getAbsolutePath());
			}
		}
	}
	
	static void a3()
	{
		File f = new File("W:\\Gentech\\FileDemo\\Assignment5");
		File f1[] = f.listFiles();
		for(File f2 : f1)
		{
			String fileName = f2.getName();
			int index = fileName.lastIndexOf('.');
			String ext = fileName.substring(index+1);
			if(ext.equals("txt"))
			{
				System.out.println(f2.delete());
			}
		}
	}
}
