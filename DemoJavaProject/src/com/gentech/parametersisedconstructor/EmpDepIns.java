package com.gentech.parametersisedconstructor;

public class EmpDepIns
{
	public static void main(String[] args) 
	{
		employee sadhish = new employee(111,"sadhish",22,"dev");
		
		department obj = new department(123,"Development",10,2);
		
		insurance obj2 = new insurance(1333,"Life insurance",100000,"Bajaj");
	}
}

class employee
{
	int id;
	String name;
	int age;
	String department;
	
	employee(int i,String n,int a,String d)
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

class department
{
	int dep_id;
	String dep_name;
	int employee_count;
	int building_no;
	
	department(int i,String n,int a,int d)
	{
		dep_id = i;
		dep_name = n;
		employee_count = a;
		building_no = d;
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
	
	insurance(int i,String n,int a,String d)
	{
		ins_id = i;
		ins_name = n;
		amount = a;
		ins_company = d;
		System.out.println("ins_id = "+ins_id);
		System.out.println("ins_name = "+ins_name);
		System.out.println("amount = "+amount);
		System.out.println("ins_company = "+ins_company);
		System.out.println("--------------------------");
	}
}
