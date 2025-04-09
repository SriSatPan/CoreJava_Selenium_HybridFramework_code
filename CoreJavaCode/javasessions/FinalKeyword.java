package javasessions;

public class FinalKeyword {

	public static void main(String[] args) {
		// constant values
		
		byte x= 10;
		x = 20; x = 30; x = 40;
		System.out.println(x); //40
		
		final byte DAYS =7; //Constant variables are written in CAPTIAL.
		//days=10 throws an error - cannot be reassigned
		
		int sal=DAYS*100;
		System.out.println(sal);//700
		
		final short DEFAULT_TIME_OUT= 10; //example
		System.out.println(DEFAULT_TIME_OUT);
		
		final String LOGIN_PAGE_TITLE ="Amazon Login";//example
		System.out.println(LOGIN_PAGE_TITLE);
		
		
		
		
		
		
		

	}

}
