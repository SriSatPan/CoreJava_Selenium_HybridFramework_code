package OOP_Inheritance;

public class Car extends Vehicle {//Car - child; Vehicle - Parent
	
	public final void service() {//final makes sure that BMW which is child of car cannot over ride this method
		
		System.out.println("car--service");
		
	}

	public void start() {

		System.out.println("car--start");

	}

	public void stop() {

		System.out.println("car--stop");

	}

	public void refuel() {

		System.out.println("car--refuel");

	}
	
   @Override
   public void petrolEngine(){
		
		System.out.println("Car-petrol-engine");
		
	}
   
   //@Override - Static method also cannot be overridden but can be overloaded 
   //now its an individual method with same name as the method in BMW
   //methood hiding - when you have a static method in parent and same in child.
   
   public static void billing() {
	   
	   System.out.println("Car-Billing");
	   
   }
   
   //@Override - cannot override private method
   /*private void pickColour() {
	   
	   System.out.println("pick-colour");
	   
   }*/

}
