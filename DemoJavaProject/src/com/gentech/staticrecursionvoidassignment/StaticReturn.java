package com.gentech.staticrecursionvoidassignment;

public class StaticReturn {

	public static void main(String[] args) 
	{
		char ch[][] = {{'a','b','c'},{'x','y','z'},{'i','j','k'}};
		char r[] = assignment.reverse2Dchar(ch);
		for(int i = 0;i<r.length;i++)
		{
			System.out.print(r[i]+" ");
		}
		System.out.println();
//-------------------------------------------------------------------------
		
		System.out.println("String Concat : "+assignment.concatchar(r));
		System.out.println();
//-------------------------------------------------------------------------
		
		char r1[] = assignment.firstrow(ch);
		for(int i = 0;i<r1.length;i++)
		{
			System.out.print(r1[i]+" ");
		}
		System.out.println();
		System.out.println();
//-------------------------------------------------------------------------
		
		char r3[] =  assignment.alpha();
		for(int i = 0;i<r3.length;i++)
		{
			System.out.print(r3[i]+" ");
		}
		System.out.println("");
		System.out.println("");
//-------------------------------------------------------------------------
		
		char r4[] =  assignment.halfalpha();
		for(int i = 0;i<r4.length;i++)
		{
			System.out.print(r4[i]+" ");
		}
		System.out.println();
		System.out.println();
//--------------------------------------------------------------------------
		

		char r5[] =  assignment.alpha2ndhalf();
		for(int i = 0;i<r5.length;i++)
		{
			System.out.print(r5[i]+" ");
		}
		System.out.println();
		System.out.println();
//---------------------------------------------------------------------------
		
		char r6[] =  assignment.reversealpha();
		for(int i = 0;i<r6.length;i++)
		{
			System.out.print(r6[i]+" ");
		}
		System.out.println("");
		System.out.println("");
//----------------------------------------------------------------------------
		
		int x[] =  assignment.prime1to50();
		for(int i = 0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println("");
		System.out.println("");
//-----------------------------------------------------------------------------
		
		int sum =  assignment.sumprime();
		System.out.print("Sum: " + sum);
		System.out.println("");
		System.out.println("");
//------------------------------------------------------------------------------
		
		int c =  assignment.countprime();
		System.out.print("count: " + c);
		System.out.println("");
		System.out.println("");
//------------------------------------------------------------------------------
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int  a1[] = assignment.thirdrow(a);
		for(int i = 0;i<a1.length;i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		System.out.println();
//-------------------------------------------------------------------------------
		
		int x1[] =  assignment.divisibleby5();
		for(int i = 0;i<x1.length;i++)
		{
			System.out.print(x1[i]+" ");
		}
		System.out.println("");
		System.out.println("");
//-------------------------------------------------------------------------------
		
		String str[] = {"abc","cba","cab","xyz","yzx","xzy"};
		String s1[] = assignment.firsthalf(str);
		for(int i = 0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
		System.out.println("");
		System.out.println("");
//-----------------------------------------------------------------------------
		
		boolean b[][] = {{true,false,true},{false,false,false},{true,true,false}};
		int br = assignment.booleantrue(b);
		for(int i = 0;i<br;i++)
		{
			System.out.println(true);
		}
		
		
	}

}
class assignment
{
	static char[] reverse2Dchar(char [][] ch)
	{
		System.out.println("Assignment 1");
		int c = 0;
		char res[] =  new char[9];
		for(int i = 2; i>=0 ;i--)
		{
			for(int j =  2;j >= 0;j--)
			{
				res[c] = ch[i][j];			
				c++;
			}
		}
		return res;
	}
	
	static String concatchar(char ch[])
	{
		System.out.println("Assignment 2");
		String res = "";
		for(int i = 0;i<ch.length;i++)
		{
			res = res+ch[i];
		}
		return res;
	}
	
	static char[] firstrow(char[][] ch)
	{
		System.out.println("Assignment 3");
		char[] res = new char[3];
		for(int i = 0;i<ch.length;i++)
		{
			res[i] = ch[0][i];
		}
		return res;
	}
	
	static char[] alpha()
	{
		System.out.println("Assignment 4");
		int i = 0;
		char res[] = new char[26];
		for(char ch = 'A';ch<='Z';ch++)
		{
			res[i] = ch;
			i++;
		}
		return res;
	}
	
	static char[] halfalpha()
	{

		System.out.println("Assignment 5");
		int i = 0;
		char res[] = new char[13];
		for(char ch = 'A';ch<='M';ch++)
		{
			res[i] = ch;
			i++;
		}
		return res;
	}
	
	static char[] alpha2ndhalf()
	{

		System.out.println("Assignment 6");
		int i = 0;
		char res[] = new char[13];
		for(char ch = 'N';ch<='Z';ch++)
		{
			res[i] = ch;
			i++;
		}
		return res;
	}
	
	static char[] reversealpha()
	{
		System.out.println("Assignment 7");
		int i = 0;
		char res[] = new char[26];
		for(char ch = 'z';ch>='a';ch--)
		{
			res[i] = ch;
			i++;
		}
		return res;
	}
	
	static int[] prime1to50()
	{
		System.out.println("Assignment 8");
		int c = 0;
		for(int j=1;j<=50;j++)
		{
	         int counter=0;
	         for(int i=1;i<=j;i++)
	         {
	            if(j%i==0)
	            {
	               counter++;
	            }
	         }
	         if(counter==2)
	         c++;
	      }
		
		int res[] = new int[c];
		c = 0;
		for(int j=1;j<=50;j++)
		{
	         int counter=0;
	         for(int i=1;i<=j;i++)
	         {
	            if(j%i==0)
	            {
	               counter++;
	            }
	         }
	         if(counter==2)
	         {
	        	 res[c] = j;
	        	 c++;
	         }
		}
		
		return res;
	}
	
	static int sumprime()
	{
		System.out.println("Assignment 9");
		int sum = 0 ;
		for(int j=1;j<=100;j++)
		{
	         int counter=0;
	         for(int i=1;i<=j;i++)
	         {
	            if(j%i==0)
	            {
	               counter++;
	            }
	         }
	         if(counter==2)
	         {
	        	 sum += j;
	         }
		}
		
		return sum;
	}
	
	static int countprime()
	{
		System.out.println("Assignment 10");
		int c = 0 ;
		for(int j=1;j<=200;j++)
		{
	         int counter=0;
	         for(int i=1;i<=j;i++)
	         {
	            if(j%i==0)
	            {
	               counter++;
	            }
	         }
	         if(counter==2)
	         {
	        	 c += 1;
	         }
		}
		
		return c;
	}
	
	static int[] thirdrow(int[][] x)
	{
		System.out.println("Assignment 11");
		int[] res = new int[3];
		for(int i = 0;i<x.length;i++)
		{
			res[i] = x[2][i];
		}
		return res;
	}
	
	static int [] divisibleby5()
	{
		System.out.println("Assignment 12");
		int count=0;
		for(int i=250;i<=500;i++)
		{
			if(i%25==0)
			{
			count++;
			}
		}
		int x[] = new int[count];
		int j = 0;
		for(int i = 250;i<=500;i++)
		{
			if(i%25==0)
			{
				x[j] = i;
				j++;
			}
		}
		return x;
	}
	
	static String[] firsthalf(String s[])
	{
		System.out.println("Assignment 13");
		int c = 0;
		String res[] = new String[s.length/2];
		for(int i = s.length/2;i<s.length;i++)
		{
			res[c] = s[i];
			c++;
		}
		return res;
	}
	
	static int booleantrue(boolean b[][])
	{
		System.out.println("Assignment 14");
		int c = 0;
		for(int i = 0;i<b.length;i++)
		{
			for(int j = 0;j<b[0].length;j++)
			{
				if(b[i][j] == true)
				{
					c++;
				}
			}
		}
		return c;
	}
}
