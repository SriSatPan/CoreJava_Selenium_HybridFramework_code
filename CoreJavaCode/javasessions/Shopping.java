package javasessions;

public class Shopping {
	
	public void test() {//duplicate method names are not allowed unless over loaded
		
	}
	
	public void test(int i) {//Method Over Load
		
	}
	
    public void test(int i, int j) {//Method Over Load
		
	}
    
    public void test(String p) {//Method Over Load
		
	}
    
    public void test(String p, int q) {//Method Over Load
		
	}
    
    public void test(int q, String p) {//Method Over Load - Order is different to above method
		
   	}
    
    
    //within the same class, if you have different methods
    //1. Method name is same.
    //2. Each method with same name has different parameters.
    //3. Each method with same name has different no of parameters.
    //4. Each method with same name has different order of the parameters.
    //5. The return type does not matter.
    
    //use cases:
    //1. Login: without password, login with name and password etc.
    //2. Search: with no parameter, search with name, search by product +name
    //3. Payments: with UPI, WIth CC.
    
	
	

	public static void main(String[] args) {
		
		
		Shopping shop = new Shopping();
		shop.test(0, null);
		//shop. -> shows the whole list of options avaiable.method overloading makes it user friendly when looking at the method list
		//code maintenance is easy because method logic will not be too long.	
		
		

	}

}
