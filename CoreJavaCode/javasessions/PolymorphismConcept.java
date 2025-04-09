package javasessions;

public class PolymorphismConcept {
	
	//many forms of a specific method.
	//Method OverLoading.
	//Method OverRiding.
	
	public void Search() {
		
	}
	
	public void search(String productName) {
		System.out.println(productName);
		
	}
	
	
    public void search(String productName, int price) {
    	
    	System.out.println(productName);
    	System.out.println(price);
		
	}

	public static void main(String[] args) {
		
		PolymorphismConcept obj = new PolymorphismConcept();
		obj.Search(); //2 states of a program. Complie and Run time.
		//Method over loading: complie time (static binding)
		obj.search("macbook");//2nd method called. decision is being taken by complier.
		obj.search("macbook",23);//3rd method  is called. Decision already taken by complier.
	
    }
	
	//Method overriding - Decision taken at run time by Interpreter (Dynamic binding)
    //complie time polymorphism is faster than Run time polymorphism
	
	
}
