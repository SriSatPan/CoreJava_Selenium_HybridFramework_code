package javasessions;

public class LoginPage {
	
	public static boolean forgotPwdLinkExit() {
		
		System.out.println("Checking forgot pwn link on page..");
		return true;
		
	}
	
	public void doLogin(String un, String pwd) {
		
		System.out.println("login with: "+ un +" and password: "+ pwd);
		System.out.println("logged in");
		
	}

}
