package javasessions;

public class Customer {
	
	String name;
	int age;
	Double Salary;
	char Gender;
	boolean isActive;
	String dob;

	public static void main(String[] args) {
		
		Customer c1 = new  Customer();
		System.out.println(c1.name);//null
		System.out.println(c1.age);//0
		System.out.println(c1.Salary);//null
		System.out.println(c1.Gender);// "\u0000' - null charcater value. blank prints on console.
		System.out.println(c1.isActive);//false
		System.out.println(c1.dob);//null
		
		System.out.println("-------");
		
		c1.name="Sat";
		System.out.println(c1.name);//Sat
		//memory Allocation heap & stack: https://gyazo.com/3890bb06416c8622a277d3b9bde33279
		
		Customer c2 = new  Customer();//2nd Object
		System.out.println(c2.name);//null
		
		Customer c3 = new  Customer();//3rd Object
		System.out.println(c3.name);//null
		
		// memory Allocation https://gyazo.com/9f3bd82d8ec6f00334f85329880c332a
		
		
		new  Customer();//4th Object. No Reference Object. Will be destroyed by G.C.
		//Customer c4; //Only reference created without object - Stack not touched by G.C
		//System.out.println(c4.name); //error
		
		// memory Allocation - https://gyazo.com/e0e6e7cd06bee2083a20de3548790a2f
		
		
		Customer c5 = new  Customer();//5th Object 
		//c5=null; //null reference object. Will be destroyed by G.C.
		//System.out.println(c5.name);
		System.out.println(c5.name);
		
		// memory allocation https://gyazo.com/0b310f375946c7a4cd48ee2c09699064
		
		
		//garbage collector - JVM
		// https://gyazo.com/be9456574567d995d1dd61035acf7b4f
		
		//call for garbage collector
		System.gc(); //jvm will still decide whether it's needed at that point of time. not good practice!
		
		
		Customer c6 = new  Customer(); //c6 - earlier reference object RHS is eligiable for the G.C 
		System.out.println(c6.name);
		Customer c7 = new  Customer();
		
		c6=c7; 
		
		Customer c8;
		c8 = new Customer();// not eligiable for G.C
		System.out.println(c8.name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
