package com.gentech.polymorphismassignment;

public class Assignment4 
{
	public static void main(String[] args) 
	{
		Weather r = null;
		
		summer a = new summer();
		Winter m = new Winter();
		Spring o = new Spring();
		
		r = a;
		r.seasons();
		
		r=m;
		r.seasons();
		
		r=o;
		r.seasons();		
	}
}

abstract class Weather
{
    abstract void seasons();
}

class summer extends Weather 
{
    void seasons()
    {
        String Name = "Summer";
        System.out.println("Season name: " + Name);
        System.out.println("Months: April, May, June");
        System.out.println();
    }
}

class Winter extends Weather 
{
    void seasons() 
    {
    	String Name = "Winter";
        System.out.println("Season name: " + Name);
        System.out.println("Months: December, January, February");
        System.out.println();
    }
}

class Spring extends Weather
{
    void seasons() 
    {
    	String Name = "Spring";
        System.out.println("Season name: " + Name);
        System.out.println("Months: March, April, May");
        System.out.println();
    }
}


