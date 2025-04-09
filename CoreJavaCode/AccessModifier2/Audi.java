package AccessModifier2;

import AccessModifier.Car;

public class Audi extends Car {

	public static void main(String[] args) {
	
		Audi a = new Audi();
		//a.brand="bmw";
		a.name="test"; //Only public accessiable
		a.price=100;//Only protected accesiable
		//a.milg; //not possible private variable within sub class

	}

}
