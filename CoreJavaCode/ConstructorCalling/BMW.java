package ConstructorCalling;

public class BMW extends Car {

	private int min_speed = 200;
	
	
    @Override
	public void display() {

		System.out.println("BMW Display");
		super.display();

	}

	public void speedcall() {

		System.out.println(min_speed);
		int carSpeed = super.min_speed;
		int diff = min_speed - carSpeed;
		System.out.println(diff);

	}

	public BMW() {

		super("kwid", 40);// calling parent class contructor - default one because there is no argument
		// always should be the first statement
		System.out.println("BMW const..");

	}

	public BMW(int price) {

		super("maruti", 800);
		// this();//always should be the first statement
		System.out.println("BMW const..");

	}

}
