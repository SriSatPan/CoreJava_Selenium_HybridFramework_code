package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		//final:
		//used to prevent class inheritance.
		//used to provide method oveririding.
		//used for constant values.
		
		BMW b = new BMW();
		b.start();//child class Method is called - Overidden method - Run time Ploymorphism //BMW--start
		b.stop();//parent class Method is called - Inherited method//car--stop
		b.refuel();//inherited Method.//car--refuel
		b.autoParking();//  - individual method - which belongs to the child class.//BMW--auto parking
		
		b.engine();//inherited from grand parent method //Vehicle-engine
		
		b.petrolEngine();//BMW-petrol-engine -> Overidden method.
		
		b.theftSafety();// BMW-theft---safety - individual method
		
		System.out.println("---------");
		
		Car c = new Car();
		c.start();// parent method is called. Now not overridden //car--start
		c.stop(); //car--stop
		c.refuel(); //car--refuel
		//c.autoParking(); Parent cannot take anything from the child class.
		c.engine();//inherited from parent //Vehicle-engine
		c.petrolEngine();//Vehicle-petrol-engine
		
		Truck t = new Truck(); //have create an object of your class because mutiple inheritance is not allowed in java
		t.loading();//Truck---load
		
		System.out.println("---------");
		
		// Top/Up Casting - Only overwritten and inherited methods can be accessed. individula method not allowed.
		//child class object can be referred by parent class variable
		
		Car c1 = new BMW(); //https://gyazo.com/4660a8e69b5f1da4fc2351a4a7178f01
		// object created will have all the methods of BMW and (Car minus the once overirdden methods in CAR by BMW child class)
		c1.start();// BMW--start since "car--start" method start is over ridden by bmw start method. 
		//So the object new BMW() will not have car start method at all!!

		c1.stop();//car--stop
		c1.refuel();//car--refuel
		
		//c1.autoParking();//cannot call by parent. parent cannot inhert child.
		//https://gyazo.com/fd72ddd67ad68022f3db95546171496d
		// https://gyazo.com/3ea9fd01f14cadaa9e59d6fb0f2cdbfb <-> reference type check failure 
		//reference type check failure - during top/up cast individual method call from child fails
		
		//BMW b1 = new Car(); down casting is not allowed in Java. Compplie time error. with type cast runtime error.
		
		//BMW b1 = (BMW)new Car();//can type cast though
		//b1.autoParking();// run time error - class OOP_Inheritance.Car cannot be cast to class OOP_Inheritance.BMW (OOP_Inheritance
		//Class cast Excpetion
		
		Vehicle v1 = new BMW();
		v1.engine();//Vehicle-engine
		v1.petrolEngine();//BMW-petrol-engine - over ridden at Vechile and Car Methods
		
		// advantages of Inheritance:
		//reunsability - need not create methods aviable in parent. Only the ones which you do not want to use over ride. 
		
		System.out.println("---------");
		
		//method is hidden
		
		Car.billing();
		BMW.billing();// if BMW billing method is commneted then the parent class billing method Car-Billing methood is called and is printed

		
	}

}
