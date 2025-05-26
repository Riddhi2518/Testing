package Conditional;

import java.util.Scanner;

public class SwitchATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
        

        System.out.println("1. Balance Inquiry");
        System.out.println("2. Cash Withdrawal");
        System.out.println("3. Cash Deposit");
        
        System.out.print("Enter your choice: ");
        int a = sc.nextInt();
        
        int balance = 50000; // Initial balance

        switch (a) {
            case 1:
               
                System.out.println("Your current balance is: ₹" + balance);
                break;

            case 2:
      
                System.out.print("Enter amount to withdraw: ₹");
                int wa = sc.nextInt();

                if (wa <= balance) {
                    balance -= wa;
                    System.out.println("Please collect your cash");
                    System.out.println("Remaining balance: ₹" + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;

            case 3:
             
                System.out.print("Enter amount to deposit: ₹");
                int da = sc.nextInt();
                balance += da;
                System.out.println("Amount deposited successfully");
                System.out.println("Updated balance: ₹" + balance);
                break;

            default:
                System.out.println("Entered wrong number");
        }


	}

}



