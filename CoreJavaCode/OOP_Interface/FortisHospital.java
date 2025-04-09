package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {
	//mutiple inheritance of Interfaces allowed.Diamond problem solved.
	//etending to a class as well
	
	//int min_fee =50;
	

	//US
	@Override
	public void physioService() {
		System.out.println("FH-physioService");
		
	}

	@Override
	public void cardioService() {
		System.out.println("FH-cardioService");
		
	}

	@Override
	public void dentalService() {
		
		System.out.println("FH-dentalService");
		
	}//you will see error until the all the methods of USmedical logic is added

	//UK
	@Override
	public void neuroServices() {
		System.out.println("FH-neuroServices");
		
	}

	@Override
	public void pedioServices() {
		
		System.out.println("FH-pedioServices");
	}
    
	//India
	@Override
	public void oncologyServices() {
		System.out.println("FH-oncologyServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH-orthoServices");
		
	}

	//common method
	@Override
	public void emergency() {
		System.out.println("FH-Emergency-Services");
		
	}
	
	//individual method
	
	public void medicalTraining() {
		System.out.println("FH-Medical-Training");
		
	}
	
	public void medicalClaim() {
		System.out.println("FH-Medical-Claim");
		
	}

	@Override //from grand parent interface
	public void covidVacinnationCamp() {
		System.out.println("WHO-Covid-vacination");
		
	}
	
	
	//@Override 
	//method hiding not over ridden
    public static void billing() {
		
		System.out.println("FH---Billing");
		
	}
    
    //default method of Interface is overridden
    @Override
    public void medicalTest() {
		
		System.out.println("FH medical---test");
		
	}
	
	
	

}
