package javasessions;

public class LoopsWithForEachLoop {

	public static void main(String[] args) {
		
		//for each loop:
		
		int emp[] = new int[5];
		
		emp[0]= 10;
		emp[1]= 20;
		emp[2]= 30;
		emp[3]= 40;
		emp[4]= 50;
		
		for (int e:emp) {
			
			System.out.println(e);
			
		}//O(n)
		
		String employee[]=new String[3];
		
		employee[0] = "Sat";
		employee[1] = "Ish";
		employee[2] = "ted";
		
		for (String em :employee) {
			
			System.out.println(em);
			
			if(em.equals("ted")){
				
				System.out.println("good girl!");
				break;
				
			}
			
		}
		
	    Object em[] = {"Sat",43,"5000$","male",true};
	    
	    for (Object x:em) {
	    	
	    	System.out.println(x);
	    }
	    
	    
	    int ar[]= {1,2,3};
	    
	    for (int i=(ar.length-1);i>=0;i--) {
	    	
	    	System.out.println(ar[i]);
	    	
	    }
		
	    //for each cannot be used to print in reverse like above. Need to use collections. No staright forward wa like above!!
	    // loop cannot be start from 2nd element etc. Always from 0- end of array scenario only!!
	    
	    
		//Memory allocation
	    
	    //Array has continous memory allocation. Fecthing data is faster.
	    // https://gyazo.com/322312b8da1f157f47652950971f4fc8
	    
	    int test[] = {10,34,12,13,12,34};
	    
		System.out.println(test.length);
		
		//Manipulation of data is risky in an Array because the Data in each segment is entierly replaced only!!
		//Deletion is also not possible. It will always have a default value that it will be replaced with.
		
		
		
		
		
	    
	    
		
		
		
	}

}
