package javasessions;

import java.util.Arrays;

public class ArrayLimitations {

	public static void main(String[] args) {
		
		int product[]= new int[50];//0-49 is the range. 
		
		//1. Fixed size
		//array size needs to be increased in the code every time demand increases
		//cannot take large arrays when not used due to memory taken in advance when data is not known and literal arrays cannot be used
		//https://gyazo.com/d9ba413ea7bfc4336d210799f25268f9
		//Solution: need a Dynamic Array and not Static 
		
		System.out.println(Arrays.toString(product));
		
		//2. Array can store only similar types of Data
		//Soultion: use Object Array.
		
		Object emp[] = new Object[10];//0-9
		
		emp[0]="Sat";
		emp[1]= 43;
		emp[2]= "5000$";
		emp[4]= "male";
		emp[5]= true;
		
		System.out.println(Arrays.toString(emp));//[Sat, 43, 5000$, null, male, true, null, null, null, null]
		//Above is still a static array.
		
		
		
		
		
		
		
		
		
		
		

	}

}
