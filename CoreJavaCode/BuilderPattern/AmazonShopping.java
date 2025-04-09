package BuilderPattern;

public class AmazonShopping {

	public static void main(String[] args) {
		
		Shopping shop = new Shopping();
		//scenario 1:
		shop.login("test@gmail.com","pass")
		 .search("tshirt")
		   .addtoCart("tshirt")
		     .doPayment("patym")
		       .generateOrder()
		         .logOut();
		
		System.out.println("------------");
		
		//scenario 2:
		shop.login("test@gmail.com", "pass")
		    .addtoCart("macbook")
		      .addtoCart("macbook")
		       .logOut();
		
		System.out.println("------------");
		
		//scenario3:
		shop.login("test@gmail.com", "pass")
		 .doPayment("123 123 123 123", 234)
		   .generateOrder()
		    .logOut();
		
		System.out.println("------------");
		
		//Scenari04:
		
		shop.login("test@gmail.com", "pass")
		    .logOut()
		     .login("test@gmail.com", "pass");
		
		

	}

}
