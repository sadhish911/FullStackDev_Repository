package com.gentech.objectassignment;

public class CountryStateDistrict {

	public static void main(String[] args) {
		country india = new country();
		india.country_code = 111;
		india.name = "India";
		india.no_of_states = 29;
		india.population = 1000000000;
		System.out.println("country_code = "+india.country_code);
		System.out.println("name = "+india.name);
		System.out.println("number of states = "+india.no_of_states);
		System.out.println("population = "+india.population);
		System.out.println("--------------------------");
		
		state Karnataka = new state();
		Karnataka.state_code = 111;
		Karnataka.name = "Karnataka";
		Karnataka.no_of_districts= 40;
		Karnataka.population = 2000000;
		System.out.println("state_code = "+Karnataka.state_code);
		System.out.println("name = "+Karnataka.name);
		System.out.println("number of districts = "+Karnataka.no_of_districts);
		System.out.println("population = "+Karnataka.population);
		System.out.println("--------------------------");
		
		
		district Bengaluru = new district();
		Bengaluru.district_code = 5600;
		Bengaluru.name = "Bengaluru";
		Bengaluru.no_of_areas = 70;
		Bengaluru.population = 100000;
		System.out.println("district_code = "+Bengaluru.district_code);
		System.out.println("name = "+Bengaluru.name);
		System.out.println("number of areas = "+Bengaluru.no_of_areas);
		System.out.println("population = "+Bengaluru.population);
		System.out.println("--------------------------");
	}
}

class country
{
	int country_code;
	String name;
	int no_of_states;
	int population;
}

class state
{
	int state_code;
	String name;
	int no_of_districts;
	int population;
}

class district
{
	int district_code;
	String name;
	int no_of_areas;
	int population;
}
