package Conditional;

import java.util.Scanner;

public class SwitchCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1 : Toyota");
		System.out.println("2 : BMW");
		System.out.println("3 : Hyundai");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Choose Car with entering any above number: ");
		int a=sc.nextInt();
		
		switch(a) {
		
		case 1:
		     System.out.println("Toyota car model");

		     System.out.println("1 : Innova crysta");
		     System.out.println("2 : Fortuner");
			 System.out.println("3 : Urban Cruiser");
		    
			 System.out.print("Choose Toyoto car model: ");
				int b=sc.nextInt();
			
			   switch(b) {
			   
			   case 1:
					 System.out.println("Innova crysta price is ₹26.82 Lakh");
					 break;	
			   case 2:
					 System.out.println("Fortuner price is ₹35.37 Lakh for base model");
					 break;	
			   case 3:
					 System.out.println("Urban Cruiser price is ₹12.58 Lakh");
					 break;	
			   default:
			    	System.out.println("Entered wrong number");
			   }
				
		     break;
		case 2:
			 System.out.println("BMW car model");
			
		     System.out.println("1 : BMW iX1");
		     System.out.println("2 : BMW Z4");
			 System.out.println("3 : BMW M340i");
		    
			 System.out.print("Choose BMW car model: ");
				int c=sc.nextInt();
			
			   switch(c) {
			   
			   case 1:
					 System.out.println("BMW iX1 price is ₹49 Lakh");
					 break;	
			   case 2:
					 System.out.println("BMW Z4 price is ₹92,90 Lakh");
					 break;	
			   case 3:
					 System.out.println("BMW M340i price is ₹75,90 Lakh");
					 break;	
			   default:
			    	System.out.println("Entered wrong number");
			   }
				
			 break;
		case 3:
			 System.out.println("Hyudai car model");

		     System.out.println("1 : Alcazar");
		     System.out.println("2 : Creta");
			 System.out.println("3 : Venue");
		    
			 System.out.print("Choose Hyudai car model: ");
				int d=sc.nextInt();
			
			   switch(d) {
			   
			   case 1:
					 System.out.println("Alcazar price is ₹17.22 Lakh");
					 break;	
			   case 2:
					 System.out.println("Creta price is ₹11.11 Lakh");
					 break;	
			   case 3:
					 System.out.println("Venue price is ₹7.94 Lakh");
					 break;	
			   default:
			    	System.out.println("Entered wrong number");
			   }
			 break;
	    default:
	    	System.out.println("Entered wrong number");
		}
	}

}
