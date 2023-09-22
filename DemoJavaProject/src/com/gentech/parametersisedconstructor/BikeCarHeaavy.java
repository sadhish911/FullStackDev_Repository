package com.gentech.parametersisedconstructor;

public class BikeCarHeaavy {

	public static void main(String[] args) {
		
		bike yamaha = new bike(111,"Yamaha",32000,"RX");
		
		car obj = new car(123,"Maruti",320000,"omni");
		
		heavy obj2 = new heavy(133,"Toyota",4000000,"Fortuner");
	}

}
class bike
{
	int bike_id;
	String company;
	int cost;
	String model;
	
	bike(int bid,String c,int co,String m)
	{
		bike_id = bid;
		company = c;
		cost = co;
		model = m;
		System.out.println("bike_id = "+bike_id);
		System.out.println("company = "+company);
		System.out.println("cost = "+cost);
		System.out.println("Model = "+model);
		System.out.println("--------------------------");
	}
}

class car
{
	int car_id;
	String company;
	int cost;
	String model;
	
	car(int cid,String c,int co,String m)
	{
		car_id = cid;
		company = c;
		cost = co;
		model = m;
		System.out.println("car_id = "+car_id);
		System.out.println("company = "+company);
		System.out.println("cost = "+cost);
		System.out.println("Model = "+model);
		System.out.println("--------------------------");
	}
}

class heavy
{
	int heavy_id;
	String company;
	int cost;
	String model;
	
	heavy(int hid,String c,int co,String m)
	{
		heavy_id = hid;
		company = c;
		cost = co;
		model = m;
		System.out.println("heavy_id = "+heavy_id);
		System.out.println("company = "+company);
		System.out.println("cost = "+cost);
		System.out.println("Model = "+model);
		System.out.println("--------------------------");
	}
}
