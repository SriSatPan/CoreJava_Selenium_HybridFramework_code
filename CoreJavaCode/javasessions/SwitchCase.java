package javasessions;

public class SwitchCase {

	public static void main(String[] args) {
		
		String browser = " Safari";
		
		switch (browser.toLowerCase().trim()) {
		
		case "chrome": 
			System.out.println("Launch Chrome!!");
			break;
			
		case "ie": 
			System.out.println("Launch ie!!");
			break;
			
		case "safari":
			System.out.println("Launch safari!!");
			break;
			
		default: 
			System.out.println("Please select valid browser!!");
			break;
		
		
		}//does not check all conditions. No of conditions checked above always 1.
		
		browser = "chrome";
		
        switch (browser) {
		
		case "chrome": 
			System.out.println("Launch Chrome!!");
			//break;
			
		case "ie": 
			System.out.println("Launch ie!!");
			//break;
			
		case "safari":
			System.out.println("Launch safari!!");
			//break;
			
		default: 
			System.out.println("Please select valid browser!!");
			//break;
		
		
		}//Prints all statements above including default starting from Chrome!!
        //default need not be at the bottom of the switch cases!!
        
        
        String envName = " Qa ";
        
        switch (envName.toLowerCase().trim()) {//covert to lower case and remove spaces
		case "qa":
			System.out.println("run tests on qa envinronment");
			break;
		
		case "uat": 
			System.out.println("run tests on uat envinronment");
			break;
			
		case "stg": 
			System.out.println("run tests on stg envinronment");
			break;
			
		case "prod":
			System.out.println("run tests on prod envinronment");
			break;
			
		case "dev": 
			System.out.println("run tests on dev envinronment");
			break;
			
		default:
			System.out.println("pass valid environment" + envName);
			break;
		}
        
        

	}

}
