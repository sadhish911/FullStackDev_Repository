package com.gentech.noreturnmethoddemo;

public class NoReturnMethodAssignment {

	public static void main(String[] args) 
	{
		byte b[] = {1,2,3,4,5,6};
		short s[] =  {1,2,3,4,5,6};
		int i[] = {1,2,3,4,5,6,7,8};
		char ch[] = {'a','e','z','t','j'};
		String st[] = {"abc","cba","cab"};
		int x[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int y[][] = {{9,8,7},{6,5,4},{3,2,1}};
		String str[][] = {{"abc","cba","cab"},{"xyz","yzx","xzy"},{"ijk","jki","ikj"}};
		assignments obj = new assignments();
		
		obj.bytearray(b);
		obj.shortarray(s);
		obj.intarray(i);
		obj.chararray(ch);
		obj.stringarray(st);
		obj.onedarraysum(i);
		obj.charvowel(ch);
		obj.int2darray(x);
		obj.int2dsumarray(y);
		obj.subtract(x, y);
		obj.squarearray(i);
		obj.concatstring(str);
		
	}

}
//	Read 2nd half of elements from byte array 
class assignments
{
	void bytearray(byte[] a)
	{
		System.out.println("Assignment 1");
		for(int i=a.length/2;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
	}
	
//	Read 1st half of elements from short array 	
	void shortarray(short s[])
	{
		System.out.println("Assignment 2");
		for(int i=s.length/2;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
		System.out.println();
	}
	
//	Read 1st half of elements from int array in reverse
	void intarray(int a[])
	{
		System.out.println("Assignment 3");
		for(int i=a.length/2-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
	}
	
//	Concat all characters 
	void chararray(char ch[])
	{
		System.out.println("Assignment 4");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println();
	}
	
//	Read all elements in reverse order from string array
	void stringarray(String s[])
	{
		System.out.println("Assignment 5");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+",");
		}
		System.out.println();
		System.out.println();
	}
	
//	Find sum of all elements from 1D integer array
	void onedarraysum(int a[])
	{
		int sum = 0;
		System.out.println("Assignment 6");
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.print("sum : " + sum);
		System.out.println();
		System.out.println();
	}
	
//	Display the vowels from an character array
	void charvowel(char c[])
	{
		System.out.println("Assignment 7");
		for(int i=0;i<c.length;i++)
		{
			char ch = c[i];
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
			{
				System.out.print(ch+", ");
			}
		}
		System.out.println();
		System.out.println();
	}
	
//	Read last row from a 3x3 integer array
	void int2darray(int x[][])
	{
		System.out.println("Assignment 8");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[2][i]+" ");
		}
		System.out.println();
		System.out.println();
	}
	
//	Sum of the first row from a 3x3 integer array
	void int2dsumarray(int a[][])
	{
		System.out.println("Assignment 9");
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[0][i];
		}
		System.out.print("sum : " + sum);
		System.out.println();
		System.out.println();
	}
	
//	Subtract 2 matrix and display in reverse order
	void subtract(int a[][],int b[][])
	{
		System.out.println("Assignment 10");
		int res[][] = new int[a.length][a[0].length];
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[0].length;j++)
			{
				res[i][j] = a[i][j] - b[i][j];
			}
		}
		
		for(int i = a.length-1;i>=0;i--)
		{
			for(int j = a[0].length-1;j>=0;j--)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
//	Square the elements in an integer array and find it's sum
	void squarearray(int x[])
	{
		System.out.println("Assignment 11");
		int sum = 0;
		for(int i=0;i<x.length;i++)
		{
			sum = sum + (x[i]*x[i]);
		}
		System.out.print("sum : " + sum);
		System.out.println();
		System.out.println();
	}
	
// Concat all elements from 2D String array
	void concatstring(String s[][])
	{
		System.out.println("Assignment 12");
		for(int i = 0;i<s.length;i++)
		{
			for(int j = 0;j<s[0].length;j++)
			{
				System.out.print(s[i][j]);
			}
		}
		System.out.println();
		System.out.println();
	}
}
