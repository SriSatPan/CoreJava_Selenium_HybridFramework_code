package constructorconcept;

public class EmployeeTest {
	
	String name;
	int age;
	double salary;
	
	//When no constructor is defined by user then java adds a hidden constructor which is called default construtor.
	
	//use case
	//restrict unnecessary creation of objects
	//intialise the global/class variable
	
	public EmployeeTest(String name) {//naame is local to the method
		
		//name=name1;
		this.name=name;
		
	}
	
    public EmployeeTest(String name, int age) {
		
		//name=name1;
		this.name=name;
		this.age=age;
		
	}
    
    public EmployeeTest(String name, int age, double salary ) {
		
  		//name=name1;
  		this.name=name;
  		this.age=age;
  		this.salary=salary;
  	}

	public static void main(String[] args) {
		
		EmployeeTest emp = new EmployeeTest("Sat");//error if name is not provided. Cannot create a default object due to constructor.
		System.out.println(emp.name);//null is constructor does not have this.name=name;
		//Sat after this.name=name; in constructor
		System.out.println(emp.age);
		System.out.println(emp.salary);
		
		EmployeeTest emp1 = new EmployeeTest("Ish",35);
		System.out.println(emp1.name+" "+emp1.age+ " "+emp1.salary);//Ish 35 0.0
		emp1.salary=25.32;

		System.out.println(emp1.name+" "+emp1.age+ " "+emp1.salary);//Ish 35 25.32
		
		EmployeeTest emp2 = new EmployeeTest("ted",8,50);
		
		System.out.println(emp2.name+" "+emp2.age+ " "+emp2.salary);//ted 8 50.0
		
		
	}

}
