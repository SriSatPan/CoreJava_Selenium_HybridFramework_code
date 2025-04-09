package javasessions;

public class StaticMethodOverloading {
	
	public  static void login() {
		
		
	}
	
    public  static void login(int i) {
		
		
	}

    public  static void login(int i,int j) {
	
	
    }
	
	

	public static void main(String a[]) {//main method is static and can be overloaded as well..
		
		System.out.println("main method");//This will be printed only!!!
		//Reason: JVM looks for public, static, void main and string of array for main method to run always!!!
		StaticMethodOverloading.main(10);
		StaticMethodOverloading.main(10,20);
		
		StaticMethodOverloading obj = new StaticMethodOverloading();
		obj.main(10, 10.23);
		
	}
	
    public static void main(String a[], int b) {//main method is static and can be overloaded as well..
		
		System.out.println("main method");//This will not be printed
		//Reason: it has naa extra int parameter
		
	}
    
    public void main(int a, double b) {//main method need not be static
    	
    	System.out.println("main method "+a+" "+b);
    	
    }
	
    public static void main(int a) {//main method is static and can be overloaded as well..
		
    	System.out.println("main method "+a);
	}
    
    public static void main() {//main method is static and can be overloaded as well..
		
    	System.out.println("main method without any value");
	}
	
	

    public static void main(int a, int b) {//main method is static and can be overloaded as well..
	   
    	System.out.println("main method "+a+" "+b);
	
    }
	
    //no use case to overload main method.
	
    //Complie time polymorphism: src code(.java)->complier Time ->.class (decision of method calling) -> JVM -> run it -> machice code (OS)
}
