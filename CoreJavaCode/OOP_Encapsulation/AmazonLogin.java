package OOP_Encapsulation;

public class AmazonLogin {

	public static void main(String[] args) {
		
		//Registration:user
		LoginPage lp = new LoginPage("sat.per@gmail.com","password");
		
		//Login:user
		
		lp.doLogin(lp.getUserName(),lp.getPassword());
		lp.setPassword("pass");
		
		System.out.println("------------------");
		
		//Registration:seller
		
		lp.doLogin(lp.getUserName(),lp.getPassword());
		
		System.out.println("------------------");
		
		//Login:seller
		LoginPage lp2 = new LoginPage("ter.per@gmail.com","ish");
		lp2.doLogin(lp2.getUserName(), lp2.getPassword());

	}

}
