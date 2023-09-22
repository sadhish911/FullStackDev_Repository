package com.gentech.noargsconsrtuctor;

public class BikeCarHeaavy {

	public static void main(String[] args) {
		
		bike yamaha = new bike();
		
		car obj = new car();
		
		heavy obj2 = new heavy();
	}

}
class bike
{
	int bike_id;
	String company;
	int cost;
	String model;
	
	bike()
	{
		bike_id = 111;
		company = "Yamaha";
		cost = 32000;
		model = "RX";
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
	
	car()
	{
		car_id = 123;
		company = "Maruti";
		cost = 320000;
		model = "omni";
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
	
	heavy()
	{
		heavy_id = 133;
		company = "Toyota";
		cost = 4000000;
		model = "fortuner";
		System.out.println("heavy_id = "+heavy_id);
		System.out.println("company = "+company);
		System.out.println("cost = "+cost);
		System.out.println("Model = "+model);
		System.out.println("--------------------------");
	}
}

