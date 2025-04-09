package constructorconcept;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	// constructor
	// name is same as class name.
	// cannot return any value including void. No return type.
	// constructor will be ccalled when you create an Obj.
	//Stored inside call memory not heap like object.
	
	public Employee() {//0 parameter contructor
		
		System.out.println("const..");
		
	}
	
	//constructor can ne overloaded as well like a method
	
     public Employee(int i) {//parametried constructor
		
		System.out.println("1 parameter const.." + i);
		
	}
	
     public Employee(int i, String j) {//parametried constructor
 		
 		System.out.println("2 parameter const.." + i + j );
 		
 	}
	public static void main(String[] args) {
		
		Employee obj = new Employee();//const..
		obj.name ="Sat";
		obj.age =20;
		obj.salary =6000;
		
		//can create n no of Objects as above and not assing any values
		
		Employee obj1 = new Employee(10);//1 parameter const..
		obj1.name="ish";
		Employee obj2 = new Employee(20,"test");//2 parameter const..20test
		obj2.name="ted";
	
		

	}

}
