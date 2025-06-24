package Conditional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1 is c language");
		System.out.println("2 is c++ language");
		System.out.println("3 is java language");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Choose above any one number: ");
		int a=sc.nextInt();
		
		switch(a) {
		
		case 1:
		     System.out.println("You selected c language");
		     break;
		case 2:
			 System.out.println("You selected c++ language");
			 break;
		case 3:
			 System.out.println("You selected java language");
			 break;
	    default:
	    	System.out.println("Entered wrong number");
		}
		
		
		
	}

}
