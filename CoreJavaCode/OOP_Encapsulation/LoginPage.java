package OOP_Encapsulation;

public class LoginPage {

	private String userName;
	private String password;

	// format -> ctrl+shift+f save-> ctrl+s

	public LoginPage(String userName, String password) {

		this.userName = userName;
		this.password = password;

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin(String userName, String password) {

		System.out.println("enter username: " + userName);
		System.out.println("enter password: " + password);
		System.out.println("click on loggin button");

		if (isUserActive(userName))

		{
			System.out.println("user is logged in...");
		} else {

			System.out.println("user is inactive..account is bllocked..");

		}

	}

	private boolean isUserActive(String userName) {

		System.out.println("Checking user status...");
		return true;

	}

}
