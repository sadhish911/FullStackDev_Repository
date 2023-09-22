package com.gentech.parametersisedconstructor;

public class DesktopLapMobile {

	public static void main(String[] args) {
		desktop lenovo = new desktop(111,"lenovo",32,10);
		
		laptop obj = new laptop(123,"HP",16,1);
		
		mobile obj2 = new mobile(133,"Apple",8,1);
	}

}
class desktop
{
	int desktop_id;
	String company;
	int ram;
	int storage;
	
	desktop(int a,String c,int r,int s)
	{
		desktop_id = a;
		company = c;
		ram = r;
		storage = s;
		System.out.println("desktop_id = "+desktop_id);
		System.out.println("company = "+company);
		System.out.println("ram = "+ram);
		System.out.println("storage = "+storage);
		System.out.println("--------------------------");
		
	}
}

class laptop
{
	int laptop_id;
	String company;
	int ram;
	int storage;
	
	laptop(int a,String c,int r,int s)
	{
		laptop_id = a;
		company = c;
		ram = r;
		storage = s;
		System.out.println("laptop_id = "+laptop_id);
		System.out.println("company = "+company);
		System.out.println("ram = "+ram);
		System.out.println("storage = "+storage);
		System.out.println("--------------------------");
	}
}

class mobile
{
	int mobile_id;
	String company;
	int ram;
	int storage;
	
	mobile(int a,String c,int r,int s)
	{
		mobile_id = a;
		company = c;
		ram = r;
		storage = s;
		System.out.println("mobile_id = "+mobile_id);
		System.out.println("company = "+company);
		System.out.println("ram = "+ram);
		System.out.println("storage = "+storage);
		System.out.println("--------------------------");
	}
}