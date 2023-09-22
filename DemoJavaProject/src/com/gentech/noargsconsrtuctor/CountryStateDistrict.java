package com.gentech.noargsconsrtuctor;

public class CountryStateDistrict {

	public static void main(String[] args) {
		country india = new country();
		
		state Karnataka = new state();
		
		district Bengaluru = new district();
	}
}

class country
{
	int country_code;
	String name;
	int no_of_states;
	int population;
	
	country()
	{
		country_code = 111;
		name = "India";
		no_of_states = 29;
		population = 1000000000;
		System.out.println("country_code = "+country_code);
		System.out.println("name = "+name);
		System.out.println("number of states = "+no_of_states);
		System.out.println("population = "+population);
		System.out.println("--------------------------");
	}
}

class state
{
	int state_code;
	String name;
	int no_of_districts;
	int population;
	
	state()
	{
		state_code = 111;
		name = "Karnataka";
		no_of_districts= 40;
		population = 2000000;
		System.out.println("state_code = "+state_code);
		System.out.println("name = "+name);
		System.out.println("number of districts = "+no_of_districts);
		System.out.println("population = "+population);
		System.out.println("--------------------------");
	}
}

class district
{
	int district_code;
	String name;
	int no_of_areas;
	int population;
	
	district()
	{
		district_code = 5600;
		name = "Bengaluru";
		no_of_areas = 70;
		population = 100000;
		System.out.println("district_code = "+district_code);
		System.out.println("name = "+name);
		System.out.println("number of areas = "+no_of_areas);
		System.out.println("population = "+population);
		System.out.println("--------------------------");
	}
}
