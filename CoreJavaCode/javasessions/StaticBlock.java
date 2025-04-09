package javasessions;

public class StaticBlock {
	
	//when no main method - this code segment cannot be run
	
	static { //This block willbe executed first. Used to execute pre execution steps in a test case.
		     //main method is still required
		
		System.out.println("Satish"); 
		
	}
	
	static {
		
		System.out.println("Lauch Chrome"); 
		
	}
	
	public static void main(String [] a) { //now code segment can be run. use PSVM shortcut on Intellij
		
		System.out.println("Hello"); 
		
		
	}

	
static {
		
		System.out.println("Enter URL"); 
		
	}
}
