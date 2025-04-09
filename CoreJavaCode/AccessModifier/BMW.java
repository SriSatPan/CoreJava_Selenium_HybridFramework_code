package AccessModifier;

public class BMW extends Car{

	public static void main(String[] args) {
		
		
		BMW b  = new BMW();
		b.brand="bmw";
		b.name="test";
		b.price=100;
		//b.milg; not possible private variable within sub class

	}

}
