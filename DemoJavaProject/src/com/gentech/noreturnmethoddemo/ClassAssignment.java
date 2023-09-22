package com.gentech.noreturnmethoddemo;

public class ClassAssignment {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int x[] = {1,2,3,4,5,6};
		assignment obj = new assignment();
//		obj.vowel('A');
//		obj.reverse(a);
//		obj.onedarray(x);
//		obj.anddemo(5, 10);
//		obj.ordemo('a');
//		obj.notdemo(5,9);
		obj.fordemo();
		obj.whiledemo();
		obj.dowhiledemo();
	}

}

class assignment
{
	void vowel(char ch)
	{
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
		{
			System.out.println("It is Vowel");
		}
		else
		{
			System.out.println("It is not a vowel");
		}
	}
	
	void reverse(int a[][])
	{
		for(int i = a.length-1;i>=0;i--)
		{
			for(int j=a[0].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}
	
	void onedarray(int x[])
	{
		int a[] = new int[x.length];
		int c = 0;
		for(int i=x.length-1;i>=0;i--)
		{
			a[c] = x[i];
			c++;
		}
		for(int i=0;i<a.length/2;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	void anddemo(int x,int y)
	{
		if(x>y && y!=x)
		{
			System.out.print(x+" is greater");
		}
		else
		{
			System.out.println(y+" is greater");
		}
	}
	
	void ordemo(char ch) {
		if(ch>=65 && ch <=90 || ch >=97 && ch<=122)
		{
			System.out.println("It is alphabet");
		}
		else
		{
			System.out.println("It is not a alphabet");
		}
	}
	
	void notdemo(int x,int y)
	{
		boolean res = x!=y;
		if(res==true)
		System.out.println("the value are not equal");
		else
			System.out.println("value are equal");
	}
	
	void fordemo()
	{
		System.out.println("Using For");
		for(int i=50;i>=40;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	void whiledemo()
	{
		System.out.println("Using While");
		int i = 50;
		while(i>=40)
		{
			System.out.print(i+" ");
			i--;
		}
		System.out.println();
	}
	
	void dowhiledemo()
	{
		System.out.println("Using DoWhile");
		int i = 50;
		do{
			System.out.print(i+" ");
			i--;
		}while(i>=40);
		System.out.println();
	}
}
