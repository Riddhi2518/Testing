package Conditional;

import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String uname="Riddhi";
		String pwd="Riddhi@123";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your Username: ");
		String a=sc.nextLine();
		
		if(a .equals(uname)) {
			
			System.out.print("Enter your Password: ");
			String b=sc.nextLine();
			
			if(b .equals(pwd)) {
				
				System.out.println("Successfully login");
			}else {
				System.out.println("Password is Invalid");
			}
			
		}else {
			System.out.println("Username is Invalid");
		}
	}

}
