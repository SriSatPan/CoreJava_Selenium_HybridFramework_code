package javasessions;

public class ObjectEmployee {
	
	String name; //Class Variable - Class data member. Assing a data value here then all objects will get the same name.
	int age;
	String city;
	

	public static void main(String[] args) {
		
		String name ="ted"; //Local Variable
		System.out.println(name);//ted
		
		//Class- a Blue print eg: Cars.
		//Object - physical entity of the Class. eg: Maruti, Reynolds etc.
	
		ObjectEmployee obj = new ObjectEmployee(); //obj is reference of the Object which has been created. 1st Object Created.
		//RHS - new ClassVariables() is the Object.
		//ClassVariables is now the Non Primiytive Data Type
		
		
		obj.name="sat";
		obj.age=43;
		obj.city="vizag";
		
		System.out.println(obj.name);
		System.out.println(obj);//javasessions.ClassVariables@129a8472 - reference value of the object.
		System.out.println(obj.name+" "+obj.age+" "+obj.city);
		
		ObjectEmployee obj1 = new ObjectEmployee(); //2nd Object created
		System.out.println(obj1.name);//null - default of a string data type.
		System.out.println(obj1.age);//0 - default of a int data type.
		
		new ObjectEmployee();// 3rd Object created but not referenced.
		new ObjectEmployee().city="bangalore";//4th object created. //null
		//non rerence objects are not recommended. cannot be used.
		
		
		
		
		
		
        
		
		
		
	}

}
