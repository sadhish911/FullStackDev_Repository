package com.gentech.bytebufferedassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Assignment6 {

	public static void main(String[] args) {
		buffereda6();
	}
	private static void buffereda6()
	{
		BufferedReader br = null;
		BufferedWriter bw = null;
		String s[] = new String[10];
		int i = 0;
		try
		{
			br = new BufferedReader(new FileReader("W:\\Gentech\\FileDemo\\Test.txt"));
			bw = new BufferedWriter(new FileWriter("W:\\Gentech\\FileDemo\\reverse.txt"));
			
			String str = null;
			while((str = br.readLine()) != null)
			{
				s[i] = str;
				i++;
			}
			
			for(int j = s.length-1;j>=0;j--)
			{
				System.out.println(s[j]);
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
