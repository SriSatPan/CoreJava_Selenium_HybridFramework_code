package javasessions;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		
		//2. Array Literals
		
		int a[] = {1,3,4,55,23,12,101}; 
		// Array Length - 7. Generally used when Data is already known. Data and memory space both allocated. 
		///28 bytes (7*4). No waste of memory.
		
		System.out.println(Arrays.toString(a));//[1, 3, 4, 55, 23, 12, 101]
		
		int ar[] = new int[4]; //Array Length - 4 - Only memory space is allocated - 4 byte per segment - 16 bytes total.
		System.out.println(Arrays.toString(ar));//[0, 0, 0, 0] - default value of int 0.
		
		double d[] = {1.1, 2.3, 43.3};
		System.out.println(Arrays.toString(d));// [1.1, 2.3, 43.3]
		
		char c[] = {'a','e','i','o','u'};
		System.out.println(Arrays.toString(c));// [a, e, i, o, u]
		
		String browsers[]= {"chrome","i.e","firefox","edge"};
		
		for(int i=0; i< (browsers.length);i++) {
			
			System.out.println(browsers[i]+ " ");//chrome i.e firefox edge 
			
			if(browsers[i].equals("i.e")) {
				
				System.out.println(browsers[i]+ " is deprecated ");
				
			}
			
		}
		
		System.out.println();
		
		
	    for(int i=0; i< (browsers.length);i++) {
			
			System.out.println(browsers[i]+ " ");//chrome i.e firefox edge 
			
			switch (browsers[i]) {
			
			case "chrome":
				System.out.println("Vendor is Google");
				break;
				
			case "i.e":	
				System.out.println("Product is deprcated");
				System.out.println("Vendor is Microsoft");
				break;
				
			case "firefox":
				System.out.println("Vendor is Mozilla");
				break;
				
			case "edge":
				System.out.println("Vendor is Microsoft");
				break;
				
			default: break;	
				
				
			}
			
		}
		
		//limitations of arrays - can only be used for real world applications which is always a fixed size of Array.
	    // eg: Months in a year
	    // eg: fixed no of seats in a theaters/Airplane
	    
	    
	    int x[] = new int[4];
		
	    x[0]=12;
	    //x[4]=13; //ArrayIndexOutOfBoundExcepton - Run time compilation error
	   
	    //System.out.println(x[4]);
		
		

	}

}
