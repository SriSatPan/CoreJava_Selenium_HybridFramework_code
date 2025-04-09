package ExceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {

		System.out.println("Hi");

		try {
			
			int i = 9 / 0;
			System.out.println(i);

		} catch (ArithmeticException e) {

			System.out.println("AE is coming...");
			e.printStackTrace();

		} // finally has to use used with try OR catch only - like try and finally only...

		finally {// always execute the code in this block with or without excpetion

			System.out.println("Bye");

		}//multiple finaly blocks not allowed!

	}

}
