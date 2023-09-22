package com.gentech.noreturnmethoddemo;

public class ReturnMethodAssignment
{
	public static void main(String[] args) 
	{	
		ReturnAssignment obj = new ReturnAssignment();
		
		System.out.println(obj.andop());
		System.out.println();
		
		System.out.println("Age : "+obj.age());
		System.out.println();
		
		System.out.println("Address : "+obj.address());
		System.out.println();
		
		int a[] = {1,2,3,4,5,6};
		System.out.println("Count : "+obj.counts(a));
		System.out.println();
		
		System.out.println("Average : "+ obj.avg(20,30));
		System.out.println();
		
		System.out.println("Sum of first 10 numbers : "+obj.sum10());
		System.out.println();
		
		System.out.println("Factorial of given number : "+obj.fact(5));
		System.out.println();
		
		System.out.println("Count of numbers divisible by 10 between 100 to 1"+obj.count10());
		System.out.println();
		
		byte b[] = {1,2,3,4,5,6};
		System.out.println("First half : ");
		byte res[] = obj.bytedemo(b);
		for(int i = 0;i<res.length;i++)
			System.out.print(res[i]+" ");
		System.out.println();
		System.out.println();
		
		short s[] = {1,2,3,4,5,6};
		System.out.println("Sum of array : "+obj.shortdemo(s));
		System.out.println();
		
		System.out.println("Average of array : "+obj.avgint(a));
		System.out.println();
		
		System.out.println("Largest of 2 numbers : "+obj.largest(10, 80));
		System.out.println();
		
		System.out.println("Smallest of 3 numbers : "+obj.smallest(20, 30, 40));
		System.out.println();
		
		boolean bo = obj.alphabet('W');
		if(bo==true)
		{
			System.out.println("It is alphabet");
		}
		else
		{
			System.out.println("It is not alphabet");
		}
		System.out.println();
		
		
		String str[][] = {{"abc","cba","cab"},{"xyz","yzx","xzy"},{"ijk","jki","ikj"}};
		String s1[][] = obj.transpose(str);
		for(int i = 0;i<s1.length;i++)
		{
			for(int j = 0;j<s1[0].length;j++)
			{
				System.out.print(s1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		int r1[] = obj.square(a);
		System.out.println("Square of array : ");
		for(int i=0;i<r1.length;i++)
		{
			System.out.print(r1[i]+" ");
		}
		System.out.println();
		System.out.println();

		int r2[] = obj.divisibleby6();
		System.out.println("Return numbers divisible by 6 inbetween 1 to 100 : ");
		for(int i=0;i<r2.length;i++)
		{
			System.out.print(r2[i]+" ");
		}
		
	}

}
class ReturnAssignment
{
	//And Operator
	boolean andop()
	{
		System.out.println("Assignment 1");
		boolean a =true;
		boolean b =false;
		boolean c = a&&b;
		return c;
	}
	
	//Return Age
	int age()
	{
		System.out.println("Assignment 2");
		return 22;
	}
	
	//Return College Address
	String address()
	{
		System.out.println("Assignment 3");
		String s = "Chagalatti,Bagalur";
		return s;
	}
	
	//No of elements in integer array
	int counts(int a[])
	{
		System.out.println("Assignment 4");
		return a.length;
	}
	
	//Average of 2 numbers
	int avg(int a,int b)
	{
		System.out.println("Assignment 5");
		return (a+b)/2;
	}
	
	//Sum of first 10 numbers
	int sum10()
	{
		System.out.println("Assignment 6");
		int sum = 0;
		for(int i=0;i<=10;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	//Factorial of given number
	int fact(int n)
	{
		System.out.println("Assignment 7");
		int f = 1;
		for(int i=2;i<=n;i++)
		{
			f*=i;
		}
		return f;
	}
	
	//Count of numbers divisible by 10 between 100 to 1
	int count10()
	{
		System.out.println("Assignment 8");
		int c = 0;
		for(int i=100;i>0;i--)
		{
			if(i%10==0)
			{
				c++;
			}
		}
		return c;
	}
	
	//Return first half of a byte array
	byte[] bytedemo(byte b[])
	{
		System.out.println("Assignment 9");
		byte res[] = new byte[b.length/2];
		for(int i=0;i<b.length/2;i++)
		{
			res[i] = b[i];
		}
		return res;
	}
	
	//Sum of short array
	short shortdemo(short s[])
	{
		System.out.println("Assignment 10");
		short res = 0;
		for(int i=0;i<s.length;i++)
		{
			res += s[i];
		}
		return res;
	}
	
	//Average of the elements in a integer array
	int avgint(int a[])
	{
		System.out.println("Assignment 11");
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum += a[i];
		}
		return sum/a.length;
	}
	
	//Return Largest of two numbers
	int largest(int a,int b)
	{
		System.out.println("Assignment 12");
		if(a>b)
		{
			return a;
		}
		return b;
	}
	
	//Return Smallest of 3 numbers
	int smallest(int a,int b,int c)
	{
		System.out.println("Assignment 13");
		if(a>b && a>c)
		{
			return a;
		}
		else if(b>a && b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	
	//Return whether alphabet or not
	boolean alphabet(char ch)
	{
		System.out.println("Assignment 14");
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Transpose a string matrix
	String[][] transpose(String a[][])
	{
		System.out.println("Assignment 15");
		String res[][] = new String[a.length][a[0].length];
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[0].length;j++)
			{
				res[j][i] = a[i][j];
			}
		}
		return res;
	}
	
	//Return the square of all elements from array
	int[] square(int a[])
	{
		System.out.println("Assignment 16");
		int res[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i] = (a[i]*a[i]);
		}
		return res;
	}
	
	//Return numbers divisible by 6 inbetween 1 to 100
	int[] divisibleby6()
	{
		System.out.println("Assignment 17");
		int c = 0;
		for(int i = 1;i<=100;i++)
		{
			if(i%6==0)
			{
				c++;
			}
		}
		int[] res = new int[c];
		c = 0;
		for(int i = 1;i<=100;i++)
		{
			if(i%6==0)
			{
				res[c] = i;
				c++;
			}
		}
		
		return res;
		
	}
	
}
