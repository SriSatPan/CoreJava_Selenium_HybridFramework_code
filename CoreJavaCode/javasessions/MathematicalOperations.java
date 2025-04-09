package javasessions;

public class MathematicalOperations {

	public static void main(String[] args) {
		
		System.out.println(4/2);//2
		System.out.println(4+2);//6
		System.out.println(4*2);//8
		System.out.println(4-2);//2
		
		System.out.println(9/3);//3
		System.out.println(9/2);//4 - 9 and 2 are Int values so output is Int.

		System.out.println(9.0/2);//4.5
		System.out.println(9/2.0);//4.5
		
		System.out.println(9.0/2.0);//4.5
		
		System.out.println((float)9/2);//4.5
		
		System.out.println(0/2);//0
		
		//System.out.println(2/0);// Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at WebAPIAutomation/javasessions.MathematicalOperations.main(MathematicalOperations.java:23)
		
		
		//System.out.println(0/0);// Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at WebAPIAutomation/javasessions.MathematicalOperations.main(MathematicalOperations.java:23)
		
		System.out.println(9.0/0); //Infinity
		System.out.println(9/0.0); //Infinity
		System.out.println(9.0/0.0);//Infinity
		
		
		System.out.println(0.0/0.0);//NaN - not a number.
		System.out.println(0.0/0.2);//0.0
		
		System.out.println((float)9/0);//Infinity
		
		System.out.println(0.0/0);//NaN - not a number.
		System.out.println(0/0.0);//NaN - not a number.
		
		
		System.out.println(9/0.0);//Infinity
		
		System.out.println('a'/2);//48
		
		System.out.println(9%3);//0
		System.out.println(9%2);//1
		
		
		
	}

}
