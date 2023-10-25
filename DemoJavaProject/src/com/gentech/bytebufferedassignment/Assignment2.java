package com.gentech.bytebufferedassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Assignment2 {

	public static void main(String[] args) 
	{
		buffereda1();
	}

	private static void buffereda1()
	{
		BufferedReader br = null;
		BufferedWriter bw = null;
		try
		{
			br = new BufferedReader(new FileReader("W:\\Gentech\\FileDemo\\Test.txt"));
			bw = new BufferedWriter(new FileWriter("W:\\Gentech\\FileDemo\\bufferedtest.txt"));
			
			String str = null;
			while((str = br.readLine()) != null)
			{
				bw.write(str);
				bw.newLine();
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
				bw.flush();
				bw.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
