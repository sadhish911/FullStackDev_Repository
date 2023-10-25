package com.gentech.utildemo;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements1();
	//	readElements2();
	//	readElementsByIterator();
	//	readElementsByEnumeration();
		withoutGenerics();
	}
	
	private static void addElements()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Pineapple");
		obj.add(0,"Grapes");
		obj.add("Jack Fruit");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		Vector<String> obj1=new Vector<String>();
		obj1.add("White");
		obj1.add("Blue");
		obj1.add("Green");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}

	private static void removeElements()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Pineapple");
		obj.add("Grapes");
		obj.add("Jack Fruit");
		obj.add("Fig");
		System.out.println("Elements :"+obj);
		obj.remove(0);
		System.out.println("Elements :"+obj);
		obj.remove("Pineapple");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	private static void readElements1()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Pineapple");
		obj.add("Grapes");
		obj.add("Jack Fruit");
		obj.add("Fig");
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	
	private static void readElements2()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Pineapple");
		obj.add("Grapes");
		obj.add("Jack Fruit");
		obj.add("Fig");
		System.out.println("Elements :"+obj);
		for(String kk:obj)
		{
			System.out.println(kk);
		}
	}
	
	private static void readElementsByIterator()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Pineapple");
		obj.add("Grapes");
		obj.add("Jack Fruit");
		obj.add("Fig");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void readElementsByEnumeration()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Pineapple");
		obj.add("Grapes");
		obj.add("Jack Fruit");
		obj.add("Fig");
		System.out.println("Elements :"+obj);
		Enumeration<String> ele=obj.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
	}
	
	private static void withoutGenerics()
	{
		Vector obj=new Vector();
		System.out.println("Elements :"+obj);
		obj.add(true);
		obj.add(75);
		obj.add("Mango");
		obj.add(100.75);
		obj.add('Y');
		System.out.println("Elements :"+obj);
	}
}
