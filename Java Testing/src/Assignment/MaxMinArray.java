package Assignment;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 array elements: ");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maxinum value is: "+max);
		
		int min=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum value is: "+min);
	}
}
