package javasessions;

public class Order {
	
	public int getOrder(String customerName,int price, int tax) {
		
		
		//always use all the parameters passed as the arguments in method logic. Good Practice.
		
		return price;
		
	}
	
    public int getOrder(int price) {
		
		//overload when all arguments are not needed every time and create different methods.
		
		return price;
		
	} 
	

	public static void main(String[] args) {
		
		Order obj = new Order();
		int p = obj.getOrder("Ish", 10, 10);
		System.out.println(p);
		
		int p1= obj.getOrder(20);
		System.out.println(p1);
		
		

	}

}
