package javasessions;

public class MethodsInJava {
	
	//cannot write a method within a method
	//methods - class data members
	
	//1. no input,no return
	//void - no return - function/method cannot return anything
	
	public void  test() {//start method name with small letter and camel case
		System.out.println("test method");
		int i=10;//scope is local for i
		System.out.println(i);
		//return i; will thrown an error.
	}

	//2. no input but some return
	//return type: int
	
	public int totalAmount() {
		
		System.out.println("Final Payment is:");
		int i=10;
		int tax=5;
		int finalPayment = i+tax;
		return finalPayment;
		
	}
	
	public String trainerName() {
		
		
		System.out.println("Trainer Name:");
		String name = "Naveen";
		return name;
		
		
	}
	
	public char getGender() {
		
		System.out.println("Gender:");
		char c = 'M';
		return c;
		
	}
	
	//3. some input and some return
	public int add(int a, int b) {//method parameters
		
		System.out.println("adding two numbers..");
		int c=a+b;
		return c;
		
	}
	
	public static void main(String[] args) {
		
		//create the object - one copy with above class variables and method is created.
		
		MethodsInJava obj = new MethodsInJava();
		obj.test();//calling the method
		int x= obj.totalAmount();
		System.out.println(x);
		String name = obj.trainerName();
		System.out.println(name);
		
		if (name.equals("Naveen")) {
			
			System.out.println("Navven Automation Labs");
			
		}
		
		System.out.println(obj.getGender()); //not a good practice. Always assign to a variable. So munipulation of return is easy.
		char gender = obj.getGender();
		System.out.println(gender);
		System.out.println((byte)gender);//manipulation of return type now possible
		
		int total = obj.add(10,20);//arguments
		System.out.println(total);
		
		int total1 = obj.add(30,40);
		System.out.println(total1-5);
		
	}

}
