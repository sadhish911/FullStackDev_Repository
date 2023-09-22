package com.gentech.programs;

public class DayNameIf {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		if(n1==1)
		{
			System.out.println("Monday");
		}
		else if(n1==2)
		{
			System.out.println("Tuesday");
		}
		else if(n1==3)
		{
			System.out.println("Wednesday");
		}
		else if(n1==4)
		{
			System.out.println("Thursday");
		}
		else if(n1==5)
		{
			System.out.println("Friday");
		}
		else if(n1==6)
		{
			System.out.println("Saturday");
		}
		else if(n1==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid");

		}
	}

}
