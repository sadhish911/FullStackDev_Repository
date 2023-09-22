package com.gentech.constructoroverloading;

public class CollegeConstructor {

	public static void main(String[] args) {
		college obj = new college("Cmr university",213);
		college obj2 = new college("VTU");
		
	}

}

class college
{
	String name;
	int college_code;
	String university_under;
	
	college(String n,int cc)
	{
		name = n;
		college_code = cc;
		System.out.println("College Name : "+name );
		System.out.println("College code : "+college_code);
	}
	
	college(String uu)
	{
		university_under = uu;
		System.out.println("Collge Under University : "+university_under );

	}
	
	college()
	{
		
	}
}
