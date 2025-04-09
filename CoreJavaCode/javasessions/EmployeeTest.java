package javasessions;

public class EmployeeTest {
	
	String name;
	int age;
	
	public void add(int a, int b) {//parameters
		
		System.out.println(a+b);
		
		
	}
	
    public void printmsg() {//parameters
		
    	System.out.println("hello");
		
	}
    
    public void getEmpInfo(EmployeeTest t2) {//ob now points to ob. eg: obj1=obj2 - t2 = t1 here
    	//scope of t2 is only to the method - getEmpInfo
    	
    	t2.name="Sat";
    	t2.age=20;
    	System.out.println(name);//Sat
    	System.out.println(age);//20
    	
    	
    }

	public static void main(String[] args) {
		
		EmployeeTest t1 = new EmployeeTest();
		t1.add(10, 20);// call by value. calling by arguments
		t1.printmsg();//call by method.
		t1.getEmpInfo(t1);//call by reference. no need to create new objects.
		
		System.out.println(t1.name);//Sat
		System.out.println(t1.age);//20
		
		t1.name="Ted";
		t1.age=30;
		
		System.out.println(t1.name);//Ted
		System.out.println(t1.age);//30
		
		t1.getEmpInfo(t1);
		
		System.out.println(t1.name);//Sat
		System.out.println(t1.age);//20
		
	}

}
