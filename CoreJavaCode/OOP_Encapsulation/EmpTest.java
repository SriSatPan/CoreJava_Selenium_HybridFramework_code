package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ted",8,5000.50,"vizag","india");//use case: POST - Create call
		//e1.name; Not accesiable - private variable name.
		
		// Above constructor is acting like the setter now (the initialisation part!!). So below code not needed!
		
		/*e1.setName("Ted");
		e1.setAge(8);
		e1.setCity("vizag");
		e1.setCountry("india");
		e1.setSalary(6000);*/
		
		String name = e1.getName();
		System.out.println(name);//Ted
		int age = e1.getAge();
		System.out.println(age);//8
		
		System.out.println(e1.getCity());//vizag  //use case: GET - call
		System.out.println(e1.getSalary());//5000.5
		System.out.println(e1.getCountry());//india
		
		// setter is used to update the values now.
		e1.setName("Sat"); //use case: PUT - Update - call 
		System.out.println(e1.getName());//Sat
	}

}
