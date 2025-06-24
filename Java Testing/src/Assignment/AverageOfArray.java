package Assignment;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array elements: ");
		
		for(int i=0; i<5; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<5; i++) {
			sum +=a[i];
		}
		double average=sum/5.0;
		
		System.out.println("Avage of array element is: "+average);
	}
}
