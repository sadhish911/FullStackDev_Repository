package com.gentech.parametersisedconstructor;

public class FruitFlowerVeg {

	public static void main(String[] args) {
		fruit mango = new fruit(111,"mango","china",250);

		flower rose = new flower(123,"rose","Srilanka",120);

		vegetable carrot = new vegetable(133,"Carrot","India",70);

	}
}

class fruit {
	int fruit_id;
	String name;
	String origin;
	int Rate;

	fruit(int fid,String n,String o,int r){
		fruit_id = fid;
		name = n;
		origin = o;
		Rate = r;
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

	flower(int fid,String n,String o,int r) {
		flower_id = fid;
		name = n;
		origin = o;
		Rate = r;
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

	vegetable(int fid,String n,String o,int r) {
		vegetable_id = fid;
		name = n;
		origin = o;
		Rate = r;
		System.out.println("vegetable_id = " + vegetable_id);
		System.out.println("name = " + name);
		System.out.println("origin = " + origin);
		System.out.println("Rate = " + Rate);
		System.out.println("--------------------------");
	}
}