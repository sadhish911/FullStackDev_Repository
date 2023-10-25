package com.gentech.fileassignment;

import java.io.File;
import java.io.IOException;

public class Assignment6 {

	public static void main(String[] args) {
		a1();
	}
	static void a1()
	{
		String s = "W:\\Gentech\\FileDemo\\Demo";
		for(int i=0;i<10;i++)
		{
			
			File f1 = new File(s+"\\d"+i+".txt");
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
