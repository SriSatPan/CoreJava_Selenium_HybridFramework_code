package ConstructorCalling;

public class Car {
	
	String name;
	int price;
	
	int min_speed=100;
	
	public void display() {
		
		System.out.println("CAR Display");
		
	}
	
	public Car() {
		
		System.out.println("CAR const..");
		
	}
	
	public Car(String name, int price) {
		System.out.println(name +" "+price);
		this.name = name;
		this.price = price;
	}
	
	

}
