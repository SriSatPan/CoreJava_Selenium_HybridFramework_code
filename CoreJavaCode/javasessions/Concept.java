package javasessions;

import java.util.ArrayList;

public class Concept {
	
	public boolean launchBrowser(String browserName) {
		
		System.out.println("browser name: "+browserName);
		
		boolean flag = true;
		
		switch(browserName.toLowerCase().trim()) {
		
		case "chrome":
			
			System.out.println("launch chrome");
			break;
			
		case "safari":
			
			System.out.println("launch safari");
			break;
			
		case "firefox":
			
			System.out.println("launch firefox");
			break;
			
		case "ie":	
			
			System.out.println("launch ie");
			break;
			
		default:
			
			System.out.println("Please pass the correct browser name..."+browserName);
			flag = false;
			break;
		
		}
		
		return flag;
		
		
	}
	
	public void testing() {
		
		System.out.println("testing method");
		return;//blank return is equal to void
	}
	
	//WAF
	//supply input param: Company Name(String): IBM,MS,Google
	//return: list of employee's of the company. ArrayList<String>
	
	public ArrayList<String> getEmpList(String compName) {
		
		System.out.println("Company Name is: "+ compName);
		
		ArrayList<String> empList =new ArrayList<String>();
		
		if(compName.trim().equalsIgnoreCase("IBM")) {
			
			empList.add("Sat");
			
		} else if (compName.trim().equalsIgnoreCase("MS")) {
			
			empList.add("Ish");
			
		} else if (compName.trim().equalsIgnoreCase("Google")) {
			
			empList.add("Ted");
			
		} else {
			System.out.println("comp name not found..pls pass the right comp name");
		}
		return empList;
		
		
	}
	
	
	
	public static void main(String[] args) {
	      //WAF:
		  //Supply a Browser name: String: Chrome/safari/firefox/IE
		  //launch the broswer
		  //return true
		
		
		Concept c = new Concept();
		boolean isLaunched = c.launchBrowser("TEST");
		System.out.println("---------------------");
		if(isLaunched) {
			
			System.out.println("enter the url...");
			
		} else {
			
			System.out.println("do not enter the url...");
			
		}
		
		Concept c1 = new Concept();
		ArrayList<String> GoogleList = c1.getEmpList("google");
		System.out.println(GoogleList);
		System.out.println (GoogleList.size());	
	
		ArrayList<String> MSList = c1.getEmpList("ms ");
		System.out.println (MSList);
		System.out.println (MSList.size());	
		
		ArrayList<String> IBMList = c1.getEmpList("ibm");
		System.out.println (IBMList);
		System.out.println (IBMList.size());	
		
		ArrayList<String> OtherList = c1.getEmpList("morsum");
		System.out.println (OtherList);	
		System.out.println (OtherList.size());	
		

	}

}
