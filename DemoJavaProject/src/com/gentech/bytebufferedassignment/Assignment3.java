package com.gentech.bytebufferedassignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class Assignment3 {

	public static void main(String[] args) {

		buffereda3();
	}
	private static void buffereda3()
	{
		BufferedReader br = null;
		String s[] = new String[10];
		int i = 0;
		try
		{
			br = new BufferedReader(new FileReader("W:\\Gentech\\FileDemo\\Test.txt"));
			
			String str = null;
			while((str = br.readLine()) != null)
			{
				s[i] = str;
				
				i++;
			}
			firsthalf(s);
			secondhalf(s);
			
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
	
	private static void firsthalf(String s[])
	{
		for(int i = 0;i<5;i++)
		{
			System.out.print(s[i]);
		}
		System.out.println();
	}
	
	private static void secondhalf(String s[])
	{
		for(int i = s.length-1;i>=5;i--)
		{
			System.out.print(s[i]);
		}
		System.out.println();
	}
}
