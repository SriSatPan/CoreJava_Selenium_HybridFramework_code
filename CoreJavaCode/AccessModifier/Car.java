package AccessModifier;

//access modifiers - https://gyazo.com/8abbff6d8f820c1fe64846bc56b860f7

public class Car {
	
	public String name;
	protected int price;
	@SuppressWarnings("unused")
	private int milg = 0;
	String brand;
	
	public static void main(String a[]) {
		
		Car c = new Car();
		c.name="sat";
		c.price=20;
		c.milg=10;
		c.brand="test";
		
		
	}

}
