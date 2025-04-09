package constructorconcept;

public class Testing {
	
	private Testing() {//restrict object creation of that class but can use static methods only
		
		System.out.println("Testing constructor..");
		
		//use case for private construtor
	}
	
	//Cannot create object of the class testing but can call the static methods.
	public static void getinfo() {
		
		System.out.println("print getInfo method");
		
	}

}
