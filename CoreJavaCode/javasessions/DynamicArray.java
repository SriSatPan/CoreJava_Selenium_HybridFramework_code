package javasessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
	
		//ArrayList--default class
		//Create the Object of ArrayList
		
		ArrayList<Object> ar = new ArrayList<Object>();//can store any data type in this Array List. 
		//but raw type will always throw warning
		System.out.println(ar.size());// 0 size of array list
		
		ar.add(100);//0 position
		ar.add("m");//1 position.current size of array 2.
		
		System.out.println(ar.size());//2.
		
		ar.add(true);//3
		ar.add("test");//4
		ar.add(500);//5th position
		
		//size of dynamic array
		
		System.out.println(ar.size());//5 - Physical capacity right now.
		
		//getting the items.
		
		System.out.println(ar.get(4));//500
		
		//System.out.println(ar.get(5)); //Exception in thread "main" java.lang.IndexOutOfBoundsException: 
		//Index 5 out of bounds for length 5. 
		//Least index is always zero. 
		
		ar.add("great!!");
		
		System.out.println(ar.get(5));//600
		
		//Array list internal memory allocation
		//https://gyazo.com/cee75143ed93badefb64842fbb8f9fdd.   load factor -> current phycial capacity/2.
		
		//generics in ArrayList
		
		ArrayList<Integer> arg = new ArrayList<Integer>();
		arg.add(100);
		
		ArrayList<String> browserList =new ArrayList<String>();
		
		browserList.add("chrome");
		browserList.add("safari");
		browserList.add("opera");
		browserList.add("firefox");
		
		System.out.println(browserList.size());//4
		System.out.println(browserList.get(3));//firefox
		
		System.out.println(browserList);//[chrome, safari, opera, firefox]
		
		//print all values using for loop
		
		for(int i=0;i<(browserList.size());i++) {
			
			System.out.println(browserList.get(i));
			
			if(browserList.get(i).equals("safari")){
				
				System.out.println ("Apple");
				break;
				
			}
			
		}
		
		//for each loop
		
		for (String e:browserList) {
			
			System.out.println (e);
			
		}
		
		System.out.println ("--------");
		
		// Add all types of Data
		ArrayList<Object> employeeData = new ArrayList<Object>();
		
		
		employeeData.add("Sat");
		employeeData.add(30);
		employeeData.add("m");
		employeeData.add("500$");
		employeeData.add(true);

		System.out.println(employeeData.size());//5
		//System.out.println(employeeData.get(6));//java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 5
		
		
		System.out.println ("--------");
		
		for(Object e:employeeData) {
			
			System.out.println (e);
		}
		
		System.out.println ("--------");
		
		System.out.println(employeeData);//cannot add any busincess logic here
		
		System.out.println ("--------");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(2200);
		numbers.add(100);
		
		for (Integer e:numbers) {//tye being used is Integer
			
			System.out.println (e);
			if(e==2200) {
				
				break;
				
			}
		}
		
		System.out.println ("--------");
		
        for (int e:numbers) {//primitive int can also be used
			
			System.out.println (e);
			if(e==2200) {
				
				break;
				
			}
		}
        
        System.out.println ("--------");
        
        //use cases:
        //total list of links on the webpage
        //total images
        //uber: car list
        //amazon: products list
        
		
		

	}

}
