package com.gentech.objectassignment;

public class EmpDepIns
{
	public static void main(String[] args) 
	{
		employee sadhish = new employee();
		sadhish.id = 111;
		sadhish.name = "sadhish";
		sadhish.age = 22;
		sadhish.department = "dev";
		System.out.println("ID = "+sadhish.id);
		System.out.println("Name = "+sadhish.name);
		System.out.println("Age = "+sadhish.age);
		System.out.println("Deparment = "+sadhish.department);
		System.out.println("--------------------------");
		
		department obj = new department();
		obj.dep_id = 123;
		obj.dep_name = "Development";
		obj.employee_count = 10;
		obj.building_no = 2;
		System.out.println("dep_id = "+obj.dep_id);
		System.out.println("dep_name = "+obj.dep_name);
		System.out.println("employee count = "+obj.employee_count);
		System.out.println("building no = "+obj.building_no);
		System.out.println("--------------------------");
		
		
		insurance obj2 = new insurance();
		obj2.ins_id = 1333;
		obj2.ins_name = "Life insurance";
		obj2.amount = 100000;
		obj2.ins_company = "Bajaj";
		System.out.println("ins_id = "+obj2.ins_id);
		System.out.println("ins_name = "+obj2.ins_name);
		System.out.println("amount = "+obj2.amount);
		System.out.println("ins_company = "+obj2.ins_company);
		System.out.println("--------------------------");
	}
}

class employee
{
	int id;
	String name;
	int age;
	String department;
}

class department
{
	int dep_id;
	String dep_name;
	int employee_count;
	int building_no;
}

class insurance
{
	int ins_id;
	String ins_name;
	int amount;
	String ins_company;
}


