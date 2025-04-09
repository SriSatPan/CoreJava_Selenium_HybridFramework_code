package ExceptionHandling;

public class TryCatchBlock {
	
	int age;
	
	// exception diagram - https://gyazo.com/cf0b11d7dcce3ab62a883915a4ba3cc9
	
	public static void main (String[] arg) {
		
		System.out.println("Hi");
		
		try {
			
		int i = 9/0;
		System.out.println(i);
		
		} catch(ArithmeticException e) {//max throwable can be used in parents - not good practice
			
			System.out.println("AE is happening... ");
			e.printStackTrace();
			
		}
		
		System.out.println("bye");
		
		
		TryCatchBlock obj = new TryCatchBlock();
		int a = obj.age;
		System.out.println(a);
		
		
		obj=null;
		
		try {
		//obj.age=20;
		
		} catch(NullPointerException e) {//max throwable can be used in parents - not good practice
			
			System.out.println("NPE is happening... ");
			e.printStackTrace();
			
		}
		
		
		
		
	}

}
