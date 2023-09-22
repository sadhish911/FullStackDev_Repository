package com.gentech.objectassignment;

public class StudentsLibSports {

	public static void main(String[] args) {
		students sadhish = new students();
		sadhish.id = 111;
		sadhish.name = "sadhish";
		sadhish.age = 22;
		sadhish.department = "IT";
		System.out.println("ID = "+sadhish.id);
		System.out.println("Name = "+sadhish.name);
		System.out.println("Age = "+sadhish.age);
		System.out.println("Deparment = "+sadhish.department);
		System.out.println("--------------------------");
		
		library obj = new library();
		obj.lib_id = 123;
		obj.book_name = "Java Development";
		obj.student_id = 111;
		obj.auhtor = "Kumar";
		System.out.println("lib_id = "+obj.lib_id);
		System.out.println("book_name = "+obj.book_name);
		System.out.println("student_id = "+obj.student_id);
		System.out.println("auhtor = "+obj.auhtor);
		System.out.println("--------------------------");
		
		
		sports obj2 = new sports();
		obj2.sports_id = 333;
		obj2.sport_name = "Basketball";
		obj2.quantity = 1;
		obj2.equipment = "Ball";
		System.out.println("sports_id = "+obj2.sports_id);
		System.out.println("sport_name = "+obj2.sport_name);
		System.out.println("quantity = "+obj2.quantity);
		System.out.println("equipment = "+obj2.equipment);
		System.out.println("--------------------------");
	}
}
class students
{
	int id;
	String name;
	int age;
	String department;
}

class library
{
	int lib_id;
	String book_name;
	int student_id;
	String auhtor;
}

class sports
{
	int sports_id;
	String sport_name;
	int quantity;
	String equipment;
}
