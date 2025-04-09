package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a=5;
		byte b=10;
		
		System.out.println(a==b);//false
		System.out.println(a==5);//true
		
		if(true) {
			System.out.println("PASS"); //PASS
		}

		if(a==b) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Hello");
		}//Hello
		
		byte c=10;
		
		if(c>a) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Hello");
		}//Hi
		
		if(c<a) {
			System.out.println("Hi");
		}//No Output
		
		if (true) {
			System.out.println("Hi Selenium");
		}
		/*else {
			System.out.println("Bye Selenium");//dead code
		}*/
		
		boolean flag = false;//can change to false. Hence no dead code warning!
		
		if (flag) {
			System.out.println("Hi Selenium");
		}
		else {
			System.out.println("Bye Selenium");
		}
		
		boolean test = true;
		
		if(!test) {
			
			System.out.println("Testing is done!!");//Will not execute as long as boolean is true.
			
		}
		else {
			
			System.out.println("Testing is pending!!");
			
		}//Testing is pending!!
		
		int number = 95;
		if(number<=100) {//nested If
			System.out.println("Calculating Your Grade!!");
			if(number>=90) {
				System.out.println("Grade A");
				if(number==100) {
					System.out.println("You got 100% Sholarship");
				}
				else {
					System.out.println("You not eligible 100% Sholarship");
				}
			}	
			else {
				if(number>=80) {
					System.out.println("Grade B");
				}

				
			}
		}
		else {
			System.out.println("Please pass the right marks!");
		}
		
		//if-else-if
		
		String browser="ie";
		
		if(browser.equals("chrome"))//nonprimitive data type comparisson do not use ==
		{
			System.out.println("Lauch Chrome!!");	
		}
		else {
			
			if(browser.equals("firefox"))
			{
				System.out.println("Lauch firefox!!");	
			}
			else {
				if(browser.equals("safari"))
				{
					System.out.println("Lauch safari!!");	
				}
				else {
					if(browser.equals("ie"))
					{
						System.out.println("Lauch ie!!");	
					}
					else {
						System.out.println("Please launch the correct browser");	
					}
					
				}
				
			}
			
			
		}
		
		
	   //if- else if	
		
       String browser1="opera";
		
		if(browser1.equals("chrome"))//nonprimitive data type comparisson do not use ==
		{
			System.out.println("Lauch Chrome!!");	
		}
		else if(browser1.equals("firefox"))
			{
				System.out.println("Lauch firefox!!");	
			}
			else if(browser1.equals("safari"))
				{
					System.out.println("Lauch safari!!");	
				}
				else if(browser1.equals("ie"))
					{
						System.out.println("Lauch ie!!");	
					}
					else {
						System.out.println("Please launch the correct browser");	
					} //this code still checks mutiple if's when the matchiing true boolean is at the very end of the if's. Not Optimanl!
		//use swtcih-case for above conditions logic!
		// break cannot be used in conditional statements. Only loops and switch case!
		
	
		
		
		
					
	}		
		
}


