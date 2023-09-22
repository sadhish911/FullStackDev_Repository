package com.gentech.programs;

public class TrafficLight {

	public static void main(String[] args) {
		String s = args[0];
		switch(s)
		{
			case "Red":
				System.out.println("Stop");
				break;
			
			case "Green":
				System.out.println("Go");
				break;
				
			case "Yellow":
				System.out.println("Slow");
				break;
				
			default :
				System.out.println("Wrong input");
		}
	}

}
