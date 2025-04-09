package javasessions;

public class SwitchCaseExamples {

	public static void main(String[] args) {
		// Issues with switch case: boolean, long, double  & float primitive data types not allowed
		// byte, short, Int and Char - primitive data type only are allowed
		//Strings are allowed
		// conditions not allowed in switch and case statements.
		
		
		short s =10; //can type to loang and float and you see a syntax error
		
		switch (s) {
		case 10:
			System.out.println(s);
			break;

		default:
			break;
		}
		
		

	}

}
