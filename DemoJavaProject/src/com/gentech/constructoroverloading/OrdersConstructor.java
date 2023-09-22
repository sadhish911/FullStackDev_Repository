package com.gentech.constructoroverloading;

public class OrdersConstructor {

	public static void main(String[] args) {
		Orders obj = new Orders(111202,5);
		Orders obj2 = new Orders(5400);
	}

}
class Orders
{
	int quantity;
	int order_code;
	int order_amount;
	
	Orders(int oc,int q)
	{
		order_code = oc;
		quantity = q;
		System.out.println("Order Code : "+order_code );
		System.out.println("Quantity : "+quantity);
	}
	
	Orders(int oa)
	{
		order_amount = oa;
		System.out.println("Order Amount : "+order_amount );

	}
	
	Orders()
	{
		
	}
}