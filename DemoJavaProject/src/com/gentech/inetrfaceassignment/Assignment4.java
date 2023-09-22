package com.gentech.inetrfaceassignment;

public class Assignment4 {

	public static void main(String[] args) {

		showallcol o = new showallcol();
		o.showcol("MSIT");
		o.showuni("VTU");
		o.showareacode(562134);
		o.showfee(10000500);
	}

}
interface collegename
{
	void showcol(String s);
}
interface Area extends collegename
{
	void showareacode(int n);
}
interface universityname extends Area
{
	void showuni(String s);
}
interface feesdetails extends collegename
{
	void showfee(int n);
}

class showallcol implements feesdetails,universityname
{
	public void showcol(String s) 
	{
		System.out.println("College : "+s);
	}
	public void showareacode(int n)
	{
		System.out.println("Area Code : "+n);
	}
	public void showuni(String s)
	{
		System.out.println("University : "+s);
	}
	
	public void showfee(int n)
	{
		System.out.println("Fees : "+n);
	}
}