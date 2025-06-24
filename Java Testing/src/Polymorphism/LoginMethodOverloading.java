package Polymorphism;

class Loginpage{
	
	void login(String uname, String pwd) {
		System.out.println("Login with Username: "+uname+", Password: "+pwd);
	}
	
	void login(long mno, int otp) {
		System.out.println("Login with Mobile no.: "+mno+", OTP: "+otp);
	}
	
	void loginWithEmail(String email, String pwd) {
		System.out.println("Login with Email: "+email+", Password: "+pwd);
	}
	
	
}
public class LoginMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loginpage lp=new Loginpage();
		lp.login("Riddhi", "Riddhi@#123");
		lp.login(9081864993L, 123);
		lp.loginWithEmail("riddhi123@gmail.com", "Riddhi@123");
				
	}

}
