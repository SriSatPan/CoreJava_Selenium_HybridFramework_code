package ExceptionHandling;

public class Testing {
	
	public static int div(int a, int b) {
		
		int z=0;;
		
		try {
			
		 z=a/b;
		
        } catch(ArithmeticException e) {
			
			e.printStackTrace();
			
		}
		
		return z;
		
		
	}
	
	public static void main (String[] arg) {
		
		
			
			int x =div(10,0);
			System.out.println(x);
		

		
	}

}
