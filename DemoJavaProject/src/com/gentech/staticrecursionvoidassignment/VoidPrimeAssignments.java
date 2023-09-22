package com.gentech.staticrecursionvoidassignment;

public class VoidPrimeAssignments 
{
	public static void main(String[] args) 
	{
		assignment3.prime100to50();
		System.out.println();
		System.out.println();
		
		assignment3.prime1to50();
		System.out.println();
		System.out.println();
		
		assignment3.prime100to200();
		System.out.println();
		
		assignment3.prime150to300();
		System.out.println();
	}
}

class assignment3
{
	static void prime100to50()
	{
		System.out.println("Assignment 1");
		for(int j=100;j>=50;j--)
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
	         System.out.print(j+" ");
	      }
	}
	
	static void prime1to50()
	{
		System.out.println("Assignment 2");
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
	         System.out.print(j+" ");
	    }
	}
	
	static void prime100to200()
	{
		int sum = 0;
		System.out.println("Assignment 3");
		for(int j=100;j<=200;j++)
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
	         sum += j;
	    }
		System.out.println("sum = "+sum);
	}
	
	static void prime150to300()
	{
		int c = 0;
		System.out.println("Assignment 4");
		for(int j=150;j<=300;j++)
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
		System.out.println("count = "+c);
	}
}
