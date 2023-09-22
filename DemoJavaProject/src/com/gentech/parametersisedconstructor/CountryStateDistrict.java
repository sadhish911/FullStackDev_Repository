package com.gentech.parametersisedconstructor;

public class CountryStateDistrict {

	public static void main(String[] args) {
		country india = new country(111,"India",29,1000000000);
		
		state Karnataka = new state(111,"Karnataka",50,123000);
		
		district Bengaluru = new district(5600,"bangalore",40,13456);
	}
}

class country
{
	int country_code;
	String name;
	int no_of_states;
	int population;
	
	country(int a,String n,int no,int p)
	{
		country_code = a;
		name = n;
		no_of_states = no;
		population = p;
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
	
	state(int a,String n,int no,int p)
	{
		state_code = a;
		name = n;
		no_of_districts = no;
		population = p;
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
	
	district(int a,String n,int no,int p)
	{
		district_code = a;
		name = n;
		no_of_areas = no;
		population = p;
		System.out.println("district_code = "+district_code);
		System.out.println("name = "+name);
		System.out.println("number of areas = "+no_of_areas);
		System.out.println("population = "+population);
		System.out.println("--------------------------");
	}
}
