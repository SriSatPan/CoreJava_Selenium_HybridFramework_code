package ConstructorCalling;

public class Employee {
	
	String name;
	int age;
	String city;
	
	public Employee() {
		
		System.out.println("Hi Employee");
		
	}
	
	
	public Employee(String name, int age) {
		
		this.name = name;
		this.age = age;
	}


	public Employee(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}


	public Employee(String name) {
		
		//this("Sat",43);
		this();//calling a construtor should always be first statement. SO can be done only once..
		this.name = name;
		this.age=35;
	
	}
	
	
	
	
	
	

}
