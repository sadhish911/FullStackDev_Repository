package com.gentech.constructoroverloading;

public class StudentConstructor {

	public static void main(String[] args) {
		student obj = new student("Sadhish",24);
		student obj2 = new student("CMR University");
	}

}
class student
{
	String name;
	int roll_no;
	String college_name;
	
	student(String n,int rn)
	{
		name = n;
		roll_no = rn;
		System.out.println("Student Name : "+name );
		System.out.println("Student Roll No : "+roll_no);
	}
	
	student(String cn)
	{
		college_name = cn;
		System.out.println("Students College : "+college_name );

	}
	
	student()
	{
		
	}
}
