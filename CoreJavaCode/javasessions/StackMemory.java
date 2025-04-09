package javasessions;

public class StackMemory {
	
	// Non-static call to non-static -> Yes -> No Object needed.
	// Static call to Static -> Yes -> No Object needed. Use Class name.
	// Non-static call to Static -> Yes Directly. No Object needed. Use Class name.
	// Static call to Non-Static -> No Directly. Need Object.
	
	//Stack -> LIFO.
	//Queue -> FIFO.
	
	
	public static void t1() {
		
		System.out.println("t1 method");//stack for t1 created LIFO
		t2();
		
	}
	
    public static void t2() {
    	
    	System.out.println("t2 method");//stack for t2 created LIFO
    	t3();
		
	}
    
    public static void t3() {
    	
    	System.out.println("t3 method");//stack for t3 created LIFO
    	//deallocation -> t3->t2->t1->m3->m2->m1->main
    	
    	//To call m3 method from here an object needs to be created  https://gyazo.com/38283df4601d0de7c955c3e9738794ce
    	
    	//StackMemory obj1 = new StackMemory();
    	//obj1.m3(); //Stack over flow
    	
	
    }
	
	public void m1() {
		
		System.out.println("m1 method");
		int i=10; //memory allocation -> https://gyazo.com/a63cd538420b808a6f2bf64950b611cc
		System.out.println(i);
		m2();//can call methods of same object directly.
		
		
	}
	
    public void m2() {
    	
    	System.out.println("m2 method");
    	int j=10; //memory allocation -> https://gyazo.com/a63cd538420b808a6f2bf64950b611cc
		System.out.println(j);
    	m3();//can call methods of same object directly.
		
	}

    public void m3() {
    	
    	System.out.println("m2 method");
    	//m1(); StackOverflowError exception due to infinite calling.
    	StackMemory.t1();
	
    }

	public static void main(String[] args) {
		
		StackMemory obj = new StackMemory();
		obj.m1();//once a object method is called then they can call other methods directly within themselves.
		
		// execution memmory allocation in stack (execution stack) -> https://gyazo.com/872d8e3d0ec4cb9945c313a70edb4f2f 
		
		//deaalocation of memory in stack ->  https://gyazo.com/bb8ff47fad1cba6211523fd39b510ebd - Last In Fist Out

	}

}
