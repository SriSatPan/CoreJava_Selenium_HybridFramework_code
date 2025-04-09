package OOP_Inheritance;

public final class BMW extends Car {// BMW now cannot be the parent of another class or in other words inherited.

	// Parent - Car, Child - BMW
	// https://gyazo.com/8d9cf198664cca85c5acdab2faf6830d

	@Override // Good Practice
	public void start() // (int i - will thown an error because parameters are not the same) {
	// overides Parent class - start method ---> Over Ridden Method. Run time
	// Polymorphism.
	// conflict between parent and childmethod with same - child method is called
	// during runtime.
	{

		System.out.println("BMW--start");// business logic in a method does not matter when over ridden
		// return 10;

	}

	// Method Over Riding - When we have a method with same name in Parent and Child
	// Class
	// With same no of Parameters.
	// With same return.
	// Sequence of parmaters should be the same in the method.
	// Also called run time/dynamic polymorphism

	// @Override - will thrown an error.
	public void autoParking() {

		System.out.println("BMW--auto parking");

	}

	@Override
	public void petrolEngine() {

		System.out.println("BMW-petrol-engine");

	}

	public void theftSafety() {

		System.out.println("BMW-theft---safety");

	}

	public static void billing() {

		System.out.println("BMW -Billing");

	}

	/*
	 * public final void service() { //cannot over ride because of final keyword for
	 * this method in Car Class
	 * 
	 * System.out.println("car--service");
	 * 
	 * }
	 */
	
	/*private void pickColour() {
		   
		   System.out.println("BMW-colour");
		   
	   }*/
	
	//Final, Private and Static method cannot be overriden
	

}
