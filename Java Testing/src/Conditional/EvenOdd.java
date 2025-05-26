package Conditional;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		
		if (a%2 == 0) {
			System.out.println(a+" is even number");
		}
		else {
			System.out.println(a+" is odd number");
		}
	}

}
