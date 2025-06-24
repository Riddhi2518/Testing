package Assignment;

import java.util.Scanner;

class Fact{
	
	int fact=1;
	void disp(int a) {
		
		for(int i=1; i<=a; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+a+" is: "+fact);
	}
}

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int ui=sc.nextInt();
		
		Fact fa=new Fact();
		fa.disp(ui);
	
	}

}
