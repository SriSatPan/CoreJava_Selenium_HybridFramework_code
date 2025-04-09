package OOP_Encapsulation;

public class Browser {
	
	public void lauchBrowser() {//practical encapsulation with out getter and setter
		
		System.out.println("launching browser...");
		checkBrowserVersion();
		checkOSCompatibilty();
		checkRAM();
		checkCPU();		
		System.out.println("browser launched...");
	}
	
    private void checkBrowserVersion() {
    	
    	System.out.println("checking browser version ...");
		
	}
    
    private void checkOSCompatibilty() {
    	
    	System.out.println("checkOSCompatibilty ...");
		
	}
    
    private void checkRAM() {
    	
    	System.out.println("checkRAM ...");
		
	}
    
    private void checkCPU() {
    	
    	System.out.println("checkCPU ...");
		
	}	

}
