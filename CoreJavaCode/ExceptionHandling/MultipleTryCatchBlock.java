package ExceptionHandling;

public class MultipleTryCatchBlock {
	
    int age;
	
	// exception diagram - https://gyazo.com/cf0b11d7dcce3ab62a883915a4ba3cc9
	
	public static void main (String[] arg) {
		
		System.out.println("Hi");
		
		try {
			
		int i = 9/0;
		System.out.println(i);
		
		//TryCatchBlock obj = new TryCatchBlock();
		//obj=null;
		//obj.age=20;
		
		} catch(ArithmeticException e) {//max throwable can be used in parents - not good practice
			//mutiple catch blocks are allowed as long as it is not duplicate
			
			System.out.println("AE is happening... ");
			e.printStackTrace();
			
		} catch(NullPointerException e){
			
			System.out.println("NPE is happening... ");
			e.printStackTrace();
			
		}
		
		System.out.println("bye");
		
		
	}

}
