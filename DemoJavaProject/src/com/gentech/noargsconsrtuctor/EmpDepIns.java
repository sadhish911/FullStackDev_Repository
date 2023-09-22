package com.gentech.noargsconsrtuctor;

public class EmpDepIns
{
	public static void main(String[] args) 
	{
		employee sadhish = new employee();
		
		
		department obj = new department();
		
		
		insurance obj2 = new insurance();
		
	}
}

class employee
{
	int id;
	String name;
	int age;
	String department;
	
	employee()
	{
		id = 111;
		name = "sadhish";
		age = 22;
		department = "dev";
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Deparment = "+department);
		System.out.println("--------------------------");
	}
}

class department
{
	int dep_id;
	String dep_name;
	int employee_count;
	int building_no;
	
	department()
	{
		dep_id = 123;
		dep_name = "Development";
		employee_count = 10;
		building_no = 2;
		System.out.println("dep_id = "+dep_id);
		System.out.println("dep_name = "+dep_name);
		System.out.println("employee count = "+employee_count);
		System.out.println("building no = "+building_no);
		System.out.println("--------------------------");
	}
}

class insurance
{
	int ins_id;
	String ins_name;
	int amount;
	String ins_company;
	
	insurance()
	{
		ins_id = 1333;
		ins_name = "Life insurance";
		amount = 100000;
		ins_company = "Bajaj";
		System.out.println("ins_id = "+ins_id);
		System.out.println("ins_name = "+ins_name);
		System.out.println("amount = "+amount);
		System.out.println("ins_company = "+ins_company);
		System.out.println("--------------------------");
	}
}
