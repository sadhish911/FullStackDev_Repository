package com.gentech.noargsconsrtuctor;

public class StudentsLibSports {

	public static void main(String[] args) {
		students sadhish = new students();
		
		library obj = new library();
		
		sports obj2 = new sports();
	}
}
class students
{
	int id;
	String name;
	int age;
	String department;
	
	students()
	{
		id = 111;
		name = "sadhish";
		age = 22;
		department = "IT";
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
	
	library()
	{
		lib_id = 123;
		book_name = "Java Development";
		student_id = 111;
		auhtor = "Kumar";
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
	
	sports()
	{
		sports_id = 333;
		sport_name = "Basketball";
		quantity = 1;
		equipment = "Ball";
		System.out.println("sports_id = "+sports_id);
		System.out.println("sport_name = "+sport_name);
		System.out.println("quantity = "+quantity);
		System.out.println("equipment = "+equipment);
		System.out.println("--------------------------");
	}
}
