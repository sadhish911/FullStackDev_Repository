package com.gentech.bytebufferedassignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assignment1 {

	public static void main(String[] args) 
	{
		bytea1();
	}

	private static void bytea1()
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;
		String s = "";
		int n = 0;
		try
		{
			fin = new FileInputStream("W:\\Gentech\\FileDemo\\Test.txt");
			fout = new FileOutputStream("W:\\Gentech\\FileDemo\\ByteTest.txt");
			while(true)
			{
				n = fin.read();
				if(n==-1)
				{
					break;
				}
				s = s+(char)n;
			}
			byte b[] = s.getBytes();
			fout.write(b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
