package Conditional;

import java.util.Scanner;

public class VoterEligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int a=sc.nextInt();
		
		if (a >=18) {
			System.out.println("You are eligible for vote");
		}else {
			System.out.println("You are not eligible for vote");
		}
		
	}

}
