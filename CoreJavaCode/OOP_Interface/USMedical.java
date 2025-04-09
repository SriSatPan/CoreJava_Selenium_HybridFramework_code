package OOP_Interface;

public interface USMedical extends WHO {//Interface to Interface its always extends
	
	//class to class extends keyword
	//class to intefrace implemets keyword
	//Interface to Interface extends keyword
	
	// contstructor of Interfcae is also not implements.
	
	//variables are allowed in Interfaces
	// they are by default final and static in nature.
	
    int min_fee=10;
   
	//100% abstraction -- OOP
	public void physioService();
	//abstarct method : 1. no method body 2. only method declaration/method prototype/no busicness logic
	
	public void cardioService();
	
	public void dentalService();
	
	public void emergency();
	
	//abstraction: implementation is defined in the methods in the class only
	//abstarct methods only allowed in Interfaces not in classes
	
	/*@Override //Over ride interface from WHO - no use case for the same since implemntaion is at case level in methods only
	public void covidVacinnationCamp();*/
	
	//after jdk 1.8 : 1. We can have static method with method body
	//not 100% abstraction.
	//1.
	public static void billing() {
		
		System.out.println("US medical---Billing");
		
	}// These cannot be overridden in Child class
	//can be called by the Iterface name.
	
	//2. default method with method body:
	
	default void medicalTest() {
		
		System.out.println("US medical---test");
		
	}
	

}
