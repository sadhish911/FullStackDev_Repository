package com.gentech.parametersisedconstructor;

public class StudentsLibSports {

	public static void main(String[] args) {
		students sadhish = new students(111,"sadhish",22,"IT");
		
		library obj = new library(123,"Java Dev",111,"Kumar");
		
		sports obj2 = new sports(333,"Basketball",1,"ball");
	}
}
class students
{
	int id;
	String name;
	int age;
	String department;
	
	students(int i,String n,int a,String d)
	{
		id = i;
		name = n;
		age = a;
		department = d;
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Deparment = "+department);
		System.out.println("--------------------------");
	}
}

class library
{
	int lib_id;
	String book_name;
	int student_id;
	String auhtor;
	
	library(int i,String n,int a,String d)
	{
		lib_id = i;
		book_name = n;
		student_id = a;
		auhtor = d;
		System.out.println("lib_id = "+lib_id);
		System.out.println("book_name = "+book_name);
		System.out.println("student_id = "+student_id);
		System.out.println("auhtor = "+auhtor);
		System.out.println("--------------------------");
	}
}

class sports
{
	int sports_id;
	String sport_name;
	int quantity;
	String equipment;
	
	sports(int i,String n,int a,String d)
	{
		sports_id = i;
		sport_name = n;
		quantity = a;
		equipment = d;
		System.out.println("sports_id = "+sports_id);
		System.out.println("sport_name = "+sport_name);
		System.out.println("quantity = "+quantity);
		System.out.println("equipment = "+equipment);
		System.out.println("--------------------------");
	}
}
