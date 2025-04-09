package BuilderPattern;

public class Shopping {

	public Shopping login() {
		
		System.out.println("Login to app:");
		return this;//current class (Shopping) Object
		//cannot return anythis else other than the class shopping object.

	}

	public Shopping login(String un, String pwd) {
		
		System.out.println("Login to app with "+un+ " "+pwd);
		return this;
	}

	public Shopping search() {
		
		System.out.println("ProductSearch");
		return this;
	}

	public Shopping search(String name) {
		
		System.out.println("Product Search: " +name);
		return this;
	}

	public Shopping addtoCart(String name) {
		
		System.out.println("Adding To Cart : " +name);
		return this;

	}

	public Shopping doPayment(String cc, int cvv) {
		
		System.out.println("making payment with: "+ cc + " "+ cvv);
		return this;
	}

	public Shopping doPayment(String upi) {
		
		System.out.println("making payment with: "+ upi);
		return this;
	}
	
	public Shopping generateOrder() {
		
		System.out.println("Your Order id is: ");
		return this;
	}
	
	public Shopping logOut() {
		
		System.out.println("Log Out");
		return this;
		
	}

}
