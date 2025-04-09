package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//HI = lenght of Array - 1
		//LI = 0
		
		//1. With new Keyword declaration
		
		int a[] = new int [10]; //range -> 0-9
		
		System.out.println(a[0]); //0 - since defalut value of an int is 0.
		
		a[0]=10;
		a[1]=20;
		a[3]=30;
		a[4]=40;
		
		System.out.println(a[0]); //10
		System.out.println(a[4]); //40
		System.out.println(a[5]); //0 - default value
		
		//System.out.println(a[11]); // Exception in thread "main" java.lang.**ArrayIndexOutOfBoundsException**: Index 11 out of bounds for 
		//length 10 at WebAPIAutomation/javasessions.ArraysConcept.main(ArraysConcept.java:23)
		
		//System.out.println(a[-1]);//ArrayIndexOutOfBoundsException
		
		int len =a.length;
		System.out.println(len);//10
		
		int hi =len-1;
		System.out.println(hi);//9
		
		int li = 0; //Lower Index - Always 0 for an Array
		System.out.println(li);//0
		
		//print all the values of an array uising for loop.
		
		for(int i=0;i <(a.length);i++) { // always < than a.lenght. Do not use <=.
			
			System.out.print(a[i]+ " "); //prints the array list
			
			
		}
		
		System.out.println();
		
		// Without using for loop.
		
		System.out.println(Arrays.toString(a)); //[10, 20, 0, 30, 40, 0, 0, 0, 0, 0]
		
		System.out.println(a); //[I@7c30a502 - memory address of the array variable will be printed!
		
		//double array
		
		double b[] = new double[3];
		//double []x = new double[2]; //This is also good syntax.
		
		b[0] = 11.23;
		b[1] = 14.12;
		b[2] = 12; //will be considered 12.0
		
		System.out.println(b[2]); //12.0
		System.out.println(b[0]+b[1]+b[2]);//37.35
		
		//String Array
		
		String []emp = new String[10]; //0-9
		
		emp[0]="Sat";
		emp[1]="Ted";
		emp[2]="Ish";
		
		System.out.println("total employees: " + emp.length);//total employees: 10
		
		//without loop
		System.out.print(Arrays.toString(emp)); //[Sat, Ted, Ish, null, null, null, null, null, null, null]
		System.out.println();
		
		//with loop
		
		String employee[]=new String [3];
		
		employee[0]="Sat";
		employee[1]="Ted";
		employee[2]="Ish";
		
		
		for(int i=0;i< employee.length;i++) {
			
			System.out.println(emp[i]);//SatTedIshnullnullnullnullnullnullnull
			
			if(emp[i].equals("Ted")) {
				System.out.println("Amazing Sal!!");
				break;
			}
			
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
