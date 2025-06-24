package Assignment;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num=sc.nextInt();
		
		int backUP=num; 
		int sum=0;
		
		while(num>0) {
			sum = sum + (num%10)*(num%10)*(num%10);
			num = num/10;
		}
		
		if(sum==backUP) {
			System.out.println(backUP + " is an Armstrong number");
		}
		else {
			System.out.println(backUP + " is NOT an Armstrong number");
		}
	
	}
}
