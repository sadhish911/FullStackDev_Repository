package com.gentech.bytebufferedassignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class Assignment5 {

	public static void main(String[] args) 
	{
		buffereda5();
	}
	private static void buffereda5()
	{
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("W:\\Gentech\\FileDemo\\Test.txt"));
			
			String str = null;
			while((str = br.readLine()) != null)
			{
				if(str.contains("Account Number"))
				{
					String s[] = str.split("=");
					System.out.println(s[1]);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
