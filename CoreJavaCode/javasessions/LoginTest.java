package javasessions;

public class LoginTest {

	public static void main(String[] args) {//entry point of the execution //runner method //calling method //user bhehaviour
		
		
		if(LoginPage.forgotPwdLinkExit()){//calling static method)
				
		System.out.println("change ur pwd");
		
	}
		
        LoginPage lp = new LoginPage();
        lp.doLogin("sat","pwd");
 }
	
	//decision on why to make a method static? common methods which exit in all classes
	
}//main method need not be static but will have to call with object of the class which has the main.

