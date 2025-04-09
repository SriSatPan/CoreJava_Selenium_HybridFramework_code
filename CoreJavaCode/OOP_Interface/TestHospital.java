package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		//cannot create object of Interface - not allowed in Java
		// https://gyazo.com/0c7944fa045e8e821b0d36d0c5f1a494
		
		FortisHospital FH = new FortisHospital();
		FH.cardioService();//US Interface method
		FH.neuroServices();//UK Inteface method
		FH.orthoServices();//Indian Interface method
		FH.emergency();//common interface method
		FH.medicalClaim();//FH individual method
		
		FH.medicalRD();//class method of parent of Fortis. Overriiden gets preferance.
		FH.medicalTest();//accessing the default void method of interface. Overriiden gets preferance.
		
		System.out.println("-------------");
		
		USMedical us  = new FortisHospital();//top casting: child class object can be referred by parent interface ref. variable
		us.cardioService();
		us.dentalService();
		us.physioService();
		us.emergency();
		us.medicalTest();//Top casting - accessing the default void method of interface 
		
		//Only US and common method can be accesed. Rest have mismatch of reference type check and cannot be accessed.
		
		
		//down casting for Inteface is not possible at complie time itself because cannot create object of Interfaces
		//new USMedical();
		
		System.out.println("-------------");
		WHO wo= new FortisHospital(); //top casting: from grandparent to child
		wo.covidVacinnationCamp();
		
		System.out.println("-------------");
		USMedical.billing();//calling Interface static method with Interface name.
		FortisHospital.billing();//calling the static method with the class name.
		
		System.out.println(USMedical.min_fee);//10
		
		//USMedical.min_fee=100; min_fee is final and cannot be changed.
		
		System.out.println(USMedical.min_fee);//10
		System.out.println(USMedical.min_fee);//50 - not variable overriding only applicable for methods.
		
		
	}
	
	//https://gyazo.com/cf34713192add21df714174d5fc47852 - mutiple inheritance of interface allowed but not classes

}
