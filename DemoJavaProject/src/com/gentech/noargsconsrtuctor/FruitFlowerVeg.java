package com.gentech.noargsconsrtuctor;

public class FruitFlowerVeg {

	public static void main(String[] args) {
		fruit mango = new fruit();

		flower rose = new flower();

		vegetable carrot = new vegetable();

	}
}

class fruit {
	int fruit_id;
	String name;
	String origin;
	int Rate;

	fruit() {
		fruit_id = 111;
		name = "mango";
		origin = "China";
		Rate = 250;
		System.out.println("fruit_id = " + fruit_id);
		System.out.println("name = " + name);
		System.out.println("origin = " + origin);
		System.out.println("Rate = " + Rate);
		System.out.println("--------------------------");

	}
}

class flower {
	int flower_id;
	String name;
	String origin;
	int Rate;

	flower() {
		flower_id = 121;
		name = "Rose";
		origin = "SriLanka";
		Rate = 120;
		System.out.println("flower_id = " + flower_id);
		System.out.println("name = " + name);
		System.out.println("origin = " + origin);
		System.out.println("Rate = " + Rate);
		System.out.println("--------------------------");

	}
}

class vegetable {
	int vegetable_id;
	String name;
	String origin;
	int Rate;

	vegetable() {
		vegetable_id = 141;
		name = "carrot";
		origin = "India";
		Rate = 200;
		System.out.println("vegetable_id = " + vegetable_id);
		System.out.println("name = " + name);
		System.out.println("origin = " + origin);
		System.out.println("Rate = " + Rate);
		System.out.println("--------------------------");
	}
}