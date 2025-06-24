package Assignment;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your marks out of 100: ");
		int marks= sc.nextInt();
		
		if(marks>90 && marks<=100) {
			System.out.println("Grade is: AA");
		}else if(marks>80 && marks<=90) {
			System.out.println("Your Grade is: AB");
		}else if(marks>70 && marks<=80) {
			System.out.println("Your Grade is: BB");
		}else if(marks>60 && marks<=70) {
			System.out.println("Your Grade is: BC");
		}else if(marks>50 && marks<=60) {
			System.out.println("Your Grade is: CD");
		}else if(marks>40 && marks<=50) {
			System.out.println("Your Grade is: DD");
		}else {
			System.out.println("You are Fail");
		}
	}
}
