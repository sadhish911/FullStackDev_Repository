package com.gentech.objectassignment;

public class DesktopLapMobile {

	public static void main(String[] args) {
		desktop lenovo = new desktop();
		lenovo.desktop_id = 111;
		lenovo.company = "lenovo";
		lenovo.ram = 32;
		lenovo.storage = 10;
		System.out.println("desktop_id = "+lenovo.desktop_id);
		System.out.println("company = "+lenovo.company);
		System.out.println("ram = "+lenovo.ram);
		System.out.println("storage = "+lenovo.storage);
		System.out.println("--------------------------");
		
		laptop obj = new laptop();
		obj.laptop_id = 123;
		obj.company = "HP";
		obj.ram = 16;
		obj.storage = 1;
		System.out.println("laptop_id = "+obj.laptop_id);
		System.out.println("company = "+obj.company);
		System.out.println("ram = "+obj.ram);
		System.out.println("storage = "+obj.storage);
		System.out.println("--------------------------");
		
		
		mobile obj2 = new mobile();
		obj2.mobile_id = 133;
		obj2.company = "Apple";
		obj2.ram = 8;
		obj2.storage = 1;
		System.out.println("mobile_id = "+obj2.mobile_id);
		System.out.println("company = "+obj2.company);
		System.out.println("ram = "+obj2.ram);
		System.out.println("storage = "+obj2.storage);
		System.out.println("--------------------------");
	}

}
class desktop
{
	int desktop_id;
	String company;
	int ram;
	int storage;
}

class laptop
{
	int laptop_id;
	String company;
	int ram;
	int storage;
}

class mobile
{
	int mobile_id;
	String company;
	int ram;
	int storage;
}

