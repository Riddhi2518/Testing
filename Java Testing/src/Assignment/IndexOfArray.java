package Assignment;

import java.util.Scanner;

public class IndexOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,8,10,12,14,18};
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter one of the element from array: ");
		int value=sc.nextInt();
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==value) {
				System.out.println("Index of that element is: "+i);
			}
		}	
	}
}
