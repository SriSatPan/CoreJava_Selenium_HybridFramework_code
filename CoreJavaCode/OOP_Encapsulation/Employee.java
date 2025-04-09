package OOP_Encapsulation;

// Encapsulation concept - https://gyazo.com/9574264dc6f6aa0364210df22ae6fa08
// 1. Only public access is given to methods. methods in turn access private properties of the object - to get the job done.
// 2. public constructor
// 3. public getter and sette

public class Employee {
	
	//private variable
	private String name;
	private int age;
	private double salary;
	private String city;
	private String country;
	
	//public constructor
	
	
	public Employee(String name, int age, double salary, String city, String country) {
		
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.city=city;
		this.country=country;
		
	}
	
	
	//public getter and setter which access the private variables
	//generate automatically -> right click -> source ->
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

		
	
	/*public void setEmpRecord(String name, int age, double salary, String City) {
		
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.City=City;
	}

	public String getName() {
		return this.name;
		
	}
	
    public int getage() {
		return age;
		
	}
    
    public double getsalary() {
		return salary;
		
	}
    
    public String getcity() {
		return City;
		
	}*/
	
	
    
    


	

}
