package com.gentech.objectassignment;

public class FruitFlowerVeg {

	public static void main(String[] args) {
		fruit mango = new fruit();
		mango.fruit_id = 111;
		mango.name = "mango";
		mango.origin = "China";
		mango.Rate = 250;
		System.out.println("fruit_id = "+mango.fruit_id);
		System.out.println("name = "+mango.name);
		System.out.println("origin = "+mango.origin);
		System.out.println("Rate = "+mango.Rate);
		System.out.println("--------------------------");
		
		flower rose = new flower();
		rose.flower_id = 121;
		rose.name = "Rose";
		rose.origin = "SriLanka";
		rose.Rate = 120;
		System.out.println("flower_id = "+rose.flower_id);
		System.out.println("name = "+rose.name);
		System.out.println("origin = "+rose.origin);
		System.out.println("Rate = "+rose.Rate);
		System.out.println("--------------------------");
		
		
		vegetable carrot = new vegetable();
		carrot.vegetable_id = 141;
		carrot.name = "carrot";
		carrot.origin = "India";
		carrot.Rate = 200;
		System.out.println("vegetable_id = "+carrot.vegetable_id);
		System.out.println("name = "+carrot.name);
		System.out.println("origin = "+carrot.origin);
		System.out.println("Rate = "+carrot.Rate);
		System.out.println("--------------------------");
	}
}

class fruit
{
	int fruit_id;
	String name;
	String origin;
	int Rate;
}

class flower
{
	int flower_id;
	String name;
	String origin;
	int Rate;
}

class vegetable
{
	int vegetable_id;
	String name;
	String origin;
	int Rate;
}