package ConstructorCalling;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp = new Employee("ish");
		System.out.println(emp.name);//ish
		System.out.println(emp.age);//35
	}

}
