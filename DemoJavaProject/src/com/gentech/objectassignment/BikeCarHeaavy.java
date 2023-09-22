package com.gentech.objectassignment;

public class BikeCarHeaavy {

	public static void main(String[] args) {
		bike yamaha = new bike();
		yamaha.bike_id = 111;
		yamaha.company = "Yamaha";
		yamaha.cost = 32000;
		yamaha.model = "RX";
		System.out.println("bike_id = "+yamaha.bike_id);
		System.out.println("company = "+yamaha.company);
		System.out.println("cost = "+yamaha.cost);
		System.out.println("Model = "+yamaha.model);
		System.out.println("--------------------------");
		
		car obj = new car();
		obj.car_id = 123;
		obj.company = "Maruti";
		obj.cost = 320000;
		obj.model = "omni";
		System.out.println("car_id = "+obj.car_id);
		System.out.println("company = "+obj.company);
		System.out.println("cost = "+obj.cost);
		System.out.println("Model = "+obj.model);
		System.out.println("--------------------------");
		
		
		heavy obj2 = new heavy();
		obj2.heavy_id = 133;
		obj2.company = "Toyota";
		obj2.cost = 4000000;
		obj2.model = "fortuner";
		System.out.println("heavy_id = "+obj2.heavy_id);
		System.out.println("company = "+obj2.company);
		System.out.println("cost = "+obj2.cost);
		System.out.println("Model = "+obj2.model);
		System.out.println("--------------------------");
	}

}
class bike
{
	int bike_id;
	String company;
	int cost;
	String model;
}

class car
{
	int car_id;
	String company;
	int cost;
	String model;
}

class heavy
{
	int heavy_id;
	String company;
	int cost;
	String model;
}
