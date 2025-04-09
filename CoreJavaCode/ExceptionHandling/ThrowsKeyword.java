package ExceptionHandling;

public class ThrowsKeyword {

	public void m1() {

		System.out.println("m1 method");
		m2();

	}

	public void m2() throws RuntimeException{

		System.out.println("m2 method");
     try {
	
	      m3();
	
    } catch(ArithmeticException e) {
    	System.out.println("AE exception");
    	e.printStackTrace();
    }

	}

	public void m3() throws RuntimeException {

		System.out.println("m3 method");
		int i = 9 / 0;
		System.out.println(i);

	}

	public static void main(String[] args) {

		ThrowsKeyword tk = new ThrowsKeyword();
		tk.m1(); // final called method handles the excpetion
		System.out.println("bye");

	}

}
