package com.gentech.constructoroverloading;

public class ProductsConstructor {

	public static void main(String[] args) {
		products obj = new products("Biscuit",134);
		products obj2 = new products("Snacks");
	}

}
class products
{
	String name;
	int product_code;
	String product_category;
	
	products(String n,int pc)
	{
		name = n;
		product_code = pc;
		System.out.println("Product Name : "+name );
		System.out.println("Product code : "+product_code);
	}
	
	products(String ppc)
	{
		product_category = ppc;
		System.out.println("Product Category : "+product_category );

	}
	
	products()
	{
		
	}
}
