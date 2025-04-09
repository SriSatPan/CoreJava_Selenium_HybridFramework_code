package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// 1. While loop:
		
		int i =1;
		while (i < 10) {
			
			System.out.println(i);
			i++;
			//++i;
			//i=i+2;
		}
		
		byte k = 1;
		while(true) {
			
		    System.out.println("Welcome!");
			
			if(k==5) {// if statemnt is within the loop hence break is valid. No syntax error!
				break;	
			}
		    k++;
		}
		
		//2. For loop: (intialise(runs only once!can be placed before the loop as well!) -> condition check
		//-> run loop logic -> increment/decerment(not mandatory!! but will cause infinite looop!!))
		
	
	for(byte j=1;j<=10;j++) {
		
		System.out.println(j);
		//j++;
		
	}
	
	/*for(;;) {//default condition boolean value is true
		 //System.out.println("Welcome!");//infinite loop.
	}*/
	
	byte p;
	for (p=1;p<=5;p++) {
		
		System.out.println(p);// 1 to 5
	}
	
	for (char ch='A';ch<='Z';ch++) {
		//System.out.println(ch); //a to z
		System.out.println(ch + " is equal to: " + (byte)ch);//A to Z with ascii values
	}
	
	//boolean and String cannot be incremented and cannot be used in for and 
	//...while as an increment operator.
	
	//double - all numeric type work.
	
	for (double d=1.1; d<=5.1;d++) {
		System.out.println(d);
		
	}
	
	// variables declared in the loop can be used mutiple times
	
	for (int w =1; w<=5;w++) {
		System.out.println(w);
		
	}
	
	for (int w =1; w<=5;w++) {
		System.out.println(w);
		
	}
	
	int w = 10; //no syntax error - above two w' scope is within thier looops.
	System.out.println(w);
	
	
	for (int e=1; e<=100; e++) {// odd nos 1 to 100
		
		if (e%2==1) {
			System.out.println(e);
		}
		
		
	}
	
	//use cases of while loop - when no of iterations are not fixed
	
	//examples - no of images on a Web page which is not fixed.
	//web table pagination.
	//web element shows on a page dependinng on the internet and app api response time which varies.
	//web page load time out.
	//calendar on a web page.
	//build  running via jenkins and email notification needs to be generated!!
	
	
	// use cases of for loop - no of iterations are fixed.
	
	// examples - calendar - month drop down - always 1-12.
	// day drop down in a month.
	// fixed category options.
	// Array and Array list which have fixed items always.
	// test data - fixed no of rows. 1 to rowSize().
	
	//do-while loop:
	// When we need the loop logic to work atleast once
	
	byte x=1;
	
	do {
		
		System.out.println(x);
		x++;
		
	}while (x<=10);
	
	//use cases of do while loop
	//examples - When a condition satifies most probably on the first web pagination itself most of the times.
	//no wait needed if elemenet is already showing up on first load
	
	//for each
	//streams when using arrays!
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
