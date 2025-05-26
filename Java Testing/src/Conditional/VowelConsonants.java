package Conditional;

import java.util.Scanner;

public class VowelConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter any one character: ");
		char a=sc.next().charAt(0);
		
		if(a >='a' && a <='z') {
			
			if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
				
				System.out.println(a+" is a vowel");
			}else {
				System.out.println(a+" is a consonant");
			}
			
		}else {
			
			System.out.println("Invalid Input");
		}
		
	}

}
