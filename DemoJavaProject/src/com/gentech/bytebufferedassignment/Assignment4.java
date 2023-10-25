package com.gentech.bytebufferedassignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class Assignment4 {

	public static void main(String[] args) 
	{
		buffereda4();
	}
	
	private static void buffereda4()
	{
		BufferedReader br = null;
		int i = 0;
		try
		{
			br = new BufferedReader(new FileReader("W:\\Gentech\\FileDemo\\Test.txt"));
			
			String str = null;
			while((str = br.readLine()) != null)
			{
				i++;
			}
			System.out.println("Number of lines : "+i);
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
