package Assignment;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter any three number: ");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.print("\nGreatest number is: ");
		if(a>b && a>c ) {
			System.out.println(a);
		}else if(b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	
	}
}
