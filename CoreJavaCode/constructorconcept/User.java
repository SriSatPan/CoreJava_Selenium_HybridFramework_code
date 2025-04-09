package constructorconcept;

public class User {
	
	String firstName;
	String lastName;
	String emailId;
	String phoneNo;//no calculations on phone no
	String password;
	String city;
	
	//Accpetance Criteria: user can be created if you have 
	//FN, LN
	//FN,LN,email
	//FN
	//FN,LN,Password, phone
	//FN.LN,email,phone,password,city
	
	//create constructors automatically
	//Right click->source->generate constructor using feilds
	
	public User(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	public User(String firstName, String lastName, String emailId) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

    

	public User(String firstName) {
		
		this.firstName = firstName;
	}


	public User(String firstName, String lastName, String password, String phoneNo) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phoneNo=phoneNo;
	}
	

	public User(String firstName, String lastName, String emailId, String phoneNo, String password, String city) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.password = password;
		this.city = city;
	}


	public static void main(String[] args) {
		
		User u1 = new User("Sat");
		System.out.println(u1.firstName+" "+u1.lastName);//Sat null
		u1.lastName ="Per";
		System.out.println(u1.firstName+" "+u1.lastName);//Sat Per
		
		User u2 = new User("Ted", "Per", "ted.per@gmail.com", "357245790", "ish", "vizag");
		System.out.println(u2.firstName+" "+u2.lastName);//Ted Per
		u2.city="anaka";
		System.out.println(u2.firstName+" "+u2.lastName+ " "+u2.city);//Ted Per anaka
		

	}
	
	//method - has to be used for business logic. Return can be used.
	//cont - has to be used only to restrict the object creation. cannot return anything.
	
	//Do not use class name as method name to differentiate with constructors- good practice
	
	//Static: Call by class name.
	//Non-Static: Create an object of the class.
	//Constructor: Called automatically when object is created.

	

}
