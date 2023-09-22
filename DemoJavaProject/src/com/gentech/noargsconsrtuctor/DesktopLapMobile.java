package com.gentech.noargsconsrtuctor;

public class DesktopLapMobile {

	public static void main(String[] args) {
		desktop lenovo = new desktop();
		
		laptop obj = new laptop();
		
		mobile obj2 = new mobile();
	}

}
class desktop
{
	int desktop_id;
	String company;
	int ram;
	int storage;
	
	desktop()
	{
		desktop_id = 111;
		company = "lenovo";
		ram = 32;
		storage = 10;
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
	
	laptop()
	{
		laptop_id = 123;
		company = "HP";
		ram = 16;
		storage = 1;
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
	
	mobile()
	{
		mobile_id = 133;
		company = "Apple";
		ram = 8;
		storage = 1;
		System.out.println("mobile_id = "+mobile_id);
		System.out.println("company = "+company);
		System.out.println("ram = "+ram);
		System.out.println("storage = "+storage);
		System.out.println("--------------------------");
	}
}


