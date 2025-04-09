package javasessions;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		
		int a = 500;
		int b = 600;
		int c=  300;
		
		if (a>b && a>c) {//over all boolean value is true or false
			// fasle && --- (not evaluated when first expresssion is false) since && is the short circuit Operator.
			
			System.out.println ("A is greatest");
			
		} else if (b>c) {
			
			System.out.println ("B is greatest");
			
		} else {
			
			System.out.println ("C is greatest");
			
		}
		
		int a1 = 2500;
		int b1 = 1600;
		int c1=  3000;
		int d1=  1200;
		
		if (a1>b1 && a1>c1 && a1>d1) {//over all boolean value is true or false
			// fasle && --- (not evaluated when first expresssion is false) since && is the short circuit Operator.
			
			System.out.println ("A1 is greatest");
			
		} else if (b1>c1 && b1>d1) {
			
			System.out.println ("B1 is greatest");
			
		} else if (c1>d1){
			
			System.out.println ("C1 is greatest");
			
		} else {
			
			System.out.println ("D1 is greatest");
			
		}
		
		

	}

}
